package com.spring.microservices.controller.impl;

import com.spring.microservices.domain.Player;
import com.spring.microservices.domain.Team;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Ndumiso on 1/8/2018.
 */
@Controller
public class MvcController {

    private Team team;

    @PostConstruct
    private void init() {
        Set<Player> players = new LinkedHashSet<Player>(Arrays.asList(
                new Player("Ndumiso", "Left Winger"),
                new Player("Jason", "Right Back"),
                new Player("Jacob", "Goal Keeper")
        ));
        this.team = new Team("Orlando Team", "Soweto", players);
    }

    @GetMapping(value = "/team")
    @ResponseBody
    public ResponseEntity<Team> getTeam() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE);
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE);
        headers.add(HttpHeaders.ACCESS_CONTROL_MAX_AGE, "300");
        headers.add(HttpHeaders.SERVER, "localhost");
        return new ResponseEntity<Team>(this.team, headers, HttpStatus.OK);
    }
}

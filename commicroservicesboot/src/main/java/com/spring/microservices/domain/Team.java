package com.spring.microservices.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

/**
 * Created by Ndumiso on 1/9/2018.
 */
@XmlRootElement
@Entity
public class Team extends BaseEntity{

    @Column
    private String name;
    @Column
    private String location;
    @Column
    private String mascotte;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }
}

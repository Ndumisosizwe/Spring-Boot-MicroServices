package com.spring.microservices.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ndumiso on 1/9/2018.
 */
@Entity
@XmlRootElement
public class Player extends BaseEntity {

    @Column
    private String name;
    @Column
    private String position;

    public Player() {
    }

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}

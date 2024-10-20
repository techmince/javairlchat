package com.jchat.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer roomId;
    @ManyToOne(targetEntity = User.class)
    User owner;
    String roomName;
}


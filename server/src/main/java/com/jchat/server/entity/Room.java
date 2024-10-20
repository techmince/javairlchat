package com.jchat.server.entity;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer room_id;
    @ManyToOne(targetEntity = User.class)
    Integer owner_id;
    String room_name;
}


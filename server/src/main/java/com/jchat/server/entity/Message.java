package com.jchat.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer message_id;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Room.class)
    Integer room_id;
    String message;
}

package com.jchat.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer messageId;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Room.class)
    Integer roomId;
    String message;
    ZonedDateTime timestamp;
}

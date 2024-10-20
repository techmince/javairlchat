package com.jchat.server.db.entity;

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
    Long messageId;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Room.class)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "FK_MESSAGE_ROOM_ID"))
    Long roomId;
    String message;
    ZonedDateTime timestamp;
}

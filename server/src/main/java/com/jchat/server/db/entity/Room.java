package com.jchat.server.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long roomId;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_ROOM_USER_ID"))
    Long userId;
    String roomName;
}


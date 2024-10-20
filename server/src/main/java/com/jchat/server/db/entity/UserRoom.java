package com.jchat.server.db.entity;

import jakarta.persistence.*;

@Entity
public class UserRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long user_room_id;
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_USER_ROOM_USER_ID"))
    Long user_id;
    @ManyToOne(targetEntity = Room.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "FK_USER_ROOM_ROOM_ID"))
    Long room_id;
}

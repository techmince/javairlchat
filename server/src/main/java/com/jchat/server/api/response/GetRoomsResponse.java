package com.jchat.server.api.response;

import com.jchat.server.db.entity.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetRoomsResponse {
    List<Room> rooms;
}

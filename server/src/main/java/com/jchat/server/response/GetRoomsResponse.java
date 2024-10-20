package com.jchat.server.response;

import com.jchat.server.entity.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetRoomsResponse {
    List<Room> rooms;
}

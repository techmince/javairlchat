package com.jchat.server.controller;


import com.jchat.server.entity.Room;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {

    public List<Room> GetAllRooms(GetRoomsRequest request){

    }
}

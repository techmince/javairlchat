package com.jchat.server.api.controller;


import com.jchat.server.db.entity.Room;
import com.jchat.server.api.request.ChangeRoomNameRequest;
import com.jchat.server.api.request.CreateRoomRequest;
import com.jchat.server.api.response.BaseResponse;
import com.jchat.server.api.response.GetRoomsResponse;
import com.jchat.server.app.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public GetRoomsResponse getAllRooms() {
        var response = new GetRoomsResponse();
        var rooms = chatService.findAll();
        response.setRooms(rooms);
        return response;
    }

    @PostMapping
    public BaseResponse createRoom(CreateRoomRequest request) {
        var room = new Room();
        room.setRoomName(request.getName());
        chatService.createRoom(room);
        return new BaseResponse();
    }

    @DeleteMapping("/{id}")
    public BaseResponse deleteRoom(@PathVariable Integer id) {
        chatService.deleteRoom(id);
        return new BaseResponse();
    }

    @PatchMapping
    public BaseResponse changeRoomName(ChangeRoomNameRequest request) {
        chatService.updateRoom(request.getId(), request.getNewName());
        return new BaseResponse();
    }
}

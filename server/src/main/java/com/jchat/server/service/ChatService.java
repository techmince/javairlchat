package com.jchat.server.service;

import com.jchat.server.dao.ChatRepository;
import com.jchat.server.entity.Room;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class ChatService {
    private final ChatRepository chatRepository;

    public ChatService(ChatRepository chatRepository){
        this.chatRepository = chatRepository;
    }

    public List<Room> findAll(){
        return chatRepository.findAll();
    }

    public Room findById(Integer id) {
        return chatRepository.findById(id).orElseThrow();
    }

    public void updateRoom(Integer id, String name)
    {
        Room room = chatRepository.getReferenceById(id);
        room.setRoomName(name);
        chatRepository.save(room);
    }

    public void deleteRoom(Integer id) {
        var room = chatRepository.findById(id).orElseThrow();
        chatRepository.delete(room);
    }

    public void createRoom(Room room)
    {
        chatRepository.save(room);
    }
}

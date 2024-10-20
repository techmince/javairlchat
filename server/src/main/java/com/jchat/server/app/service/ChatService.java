package com.jchat.server.app.service;

import com.jchat.server.db.repository.RoomRepository;
import com.jchat.server.db.entity.Room;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class ChatService {
    private final RoomRepository roomRepository;

    public ChatService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public List<Room> findAll(){
        return roomRepository.findAll();
    }

    public Room findById(Integer id) {
        return roomRepository.findById(id).orElseThrow();
    }

    public void updateRoom(Integer id, String name)
    {
        Room room = roomRepository.getReferenceById(id);
        room.setRoomName(name);
        roomRepository.save(room);
    }

    public void deleteRoom(Integer id) {
        var room = roomRepository.findById(id).orElseThrow();
        roomRepository.delete(room);
    }

    public void createRoom(Room room)
    {
        roomRepository.save(room);
    }
}

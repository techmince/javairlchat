package com.jchat.server.dao;

import com.jchat.server.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Room, Integer> {

}

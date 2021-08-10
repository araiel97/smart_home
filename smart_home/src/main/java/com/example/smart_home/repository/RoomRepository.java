package com.example.smart_home.repository;

import com.example.smart_home.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer>{
    Room findByName(String name);
}

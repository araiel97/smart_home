package com.example.smart_home.service;

import com.example.smart_home.entity.Room;
import com.example.smart_home.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repository;
    public Room addRoom(Room room) {return repository.save(room);}
    public List<Room> addRooms(List<Room> rooms) {return repository.saveAll(rooms);}
    public List<Room> findAllRooms(List<Room> rooms) {return  repository.findAll();}
    public Room getRoomById(int id){ return repository.findById(id).orElse(null);}
    public Room getRoomByName(String name){return repository.findByName(name);}
    public String deleteRoomById(int id){ repository.deleteById(id);
    return "Room removed successfully";
    }
    public Room updateRoom(Room room){
        Room room_chosen = repository.findById(room.getId()).orElse(null);
        room_chosen.setName(room.getName());
        return repository.save(room_chosen);
    }
}

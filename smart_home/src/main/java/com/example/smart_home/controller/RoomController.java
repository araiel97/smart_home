package com.example.smart_home.controller;

import com.example.smart_home.entity.Room;
import com.example.smart_home.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    private RoomService service;
    public Room room;
    public Room addRoom(@RequestBody Room room){ return service.addRoom(room);}
    public List<Room> addRooms(@RequestBody List <Room> rooms) { return service.addRooms(rooms);}
    public Room findRoomById(int id){ return service.getRoomById(id);}
}

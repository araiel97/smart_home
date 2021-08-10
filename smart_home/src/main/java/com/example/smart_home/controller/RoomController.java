package com.example.smart_home.controller;

import com.example.smart_home.entity.Room;
import com.example.smart_home.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    private RoomService service;
    public Room room;

    @PostMapping("/addRoom")
    public Room addRoom(@RequestBody Room room){ return service.addRoom(room);}
    @PostMapping("/addRooms")
    public List<Room> addRooms(@RequestBody List <Room> rooms) { return service.addRooms(rooms);}
    @GetMapping("/Rooms")
    public List<Room> findRooms(){ return service.findAllRooms();}
    @GetMapping("/Room/{id}")
    public Room findRoomById(@PathVariable int id){ return service.findRoomById(id);}
    @GetMapping("/Room/{name}")
    public Room findRoomByName(@PathVariable String name){ return service.findRoomByName(name);}
    @DeleteMapping("/Room/delete/{id}")
    public String deleteRoomById(@PathVariable int id){ return service.deleteRoomById(id);}
    @PutMapping("/Room/update/{name}")
    public Room updateRoom(@RequestBody Room room){ return service.updateRoom(room);}
}

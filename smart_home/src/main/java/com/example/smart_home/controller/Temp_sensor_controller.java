package com.example.smart_home.controller;

import com.example.smart_home.entity.Temp_sensor;
import com.example.smart_home.service.Temp_sensor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Temp_sensor_controller {
    @Autowired
    private Temp_sensor_Service service;
    public Temp_sensor temp_sensor;

    @PostMapping("/addTempSensor")
    public Temp_sensor addSensor(@RequestBody Temp_sensor temp_sensor){
        return service.add_sensor(temp_sensor);
    }
    @PostMapping("/addTempSensors")
    public List<Temp_sensor> addSensor(@RequestBody List<Temp_sensor> temp_sensors){
        return service.add_sensors(temp_sensors);
    }
    @GetMapping("/TempSensors")
    public List<Temp_sensor> findAllTempSensors(){
        return service.getTempSensors();
    }
    @GetMapping("/TempSensor/{id}")
    public Temp_sensor findTempSensorByID(@PathVariable int id){
        return service.getTemp_SensorById(id);
    }
    @GetMapping("/TempSensor/{name}")
    public Temp_sensor findTempSensorByName(@PathVariable String name){
        return service.getTemp_SensorByName(name);
    }
    @GetMapping("/TempSensor/update")
    public Temp_sensor updateTempSensor(@RequestBody Temp_sensor temp_sensor){
        return service.updateTemp_sensor(temp_sensor);

    }
}

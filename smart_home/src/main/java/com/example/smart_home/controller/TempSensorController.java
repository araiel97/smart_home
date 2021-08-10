package com.example.smart_home.controller;

import com.example.smart_home.entity.TempSensor;
import com.example.smart_home.service.TempSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TempSensorController {
    @Autowired
    private TempSensorService service;
    public TempSensor temp_sensor;

    @PostMapping("/addTempSensor")
    public TempSensor addSensor(@RequestBody TempSensor temp_sensor){ return service.addTempSensor(temp_sensor);}
    @PostMapping("/addTempSensors")
    public List<TempSensor> addSensors(@RequestBody List<TempSensor> temp_sensors){ return service.addTempSensors(temp_sensors);}
    @GetMapping("/TempSensors")
    public List<TempSensor> findTempSensors(){ return service.findAllTempSensors();}
    @GetMapping("/TempSensor/{id}")
    public TempSensor findTempSensorByID(@PathVariable int id){ return service.findTempSensorById(id);}
    @GetMapping("/TempSensor/{name}")
    public TempSensor findTempSensorByName(@PathVariable String name){ return service.findTempSensorByName(name);}
    @PutMapping("/TempSensor/update")
    public TempSensor updateTempSensor(@RequestBody TempSensor temp_sensor){ return service.updateTempSensor(temp_sensor);}
    @DeleteMapping("/TempSensor/delete/{id}")
    public String deleteTempSensor(@PathVariable int id){ return service.deleteTempSensorById(id);}
}

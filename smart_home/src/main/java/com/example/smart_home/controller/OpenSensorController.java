package com.example.smart_home.controller;

import com.example.smart_home.entity.OpenSensor;
import com.example.smart_home.service.OpenSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OpenSensorController {
    @Autowired
    private OpenSensorService service;
    public OpenSensor openSensor;
    @PostMapping("/addOpenSensor")
    public OpenSensor addSensor(@RequestBody OpenSensor openSensor) { return service.addOpenSensor(openSensor);}
    @PostMapping("/addOpenSensors")
    public List <OpenSensor> addOpenSensors(@RequestBody List<OpenSensor> openSensors) {return service.addOpenSensors(openSensors);}
    @GetMapping("/OpenSensors")
    public List <OpenSensor> findOpenSensors(@RequestBody List<OpenSensor> openSensors) {return service.findOpenSensors();}
    @GetMapping("/OpenSensor/{id}")
    public OpenSensor findOpenSensorById(@PathVariable int id){return service.findOpenSensorById(id);}
    @GetMapping("/OpenSensor/{name}")
    public OpenSensor findOpenSensorByName(@PathVariable String name){ return service.findOpenSensorByName(name);}
    @DeleteMapping("/OpenSensor/delete/{id}")
    public String deleteOpenSensor(@PathVariable int id){ return service.deleteOpenSensorById(id);}
    @PutMapping("/OpenSensor/update")
    public OpenSensor updateOpenSensor(@RequestBody OpenSensor openSensor) {return service.updateOpenSensor(openSensor);}

}

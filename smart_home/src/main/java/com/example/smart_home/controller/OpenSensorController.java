package com.example.smart_home.controller;

import com.example.smart_home.entity.OpenSensor;
import com.example.smart_home.service.OpenSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OpenSensorController {
    @Autowired
    private OpenSensorService service;
    public OpenSensor openSensor;

    public OpenSensor addSensor(@RequestBody OpenSensor openSensor) { return service.addOpenSensor(openSensor);}
    public List <OpenSensor> addOpenSensors(@RequestBody List<OpenSensor> openSensors) {return service.addOpenSensors(openSensors);}
    public List <OpenSensor> findOpenSensors(@RequestBody List<OpenSensor> openSensors) {return service.findOpenSensors();}
    public OpenSensor findOpenSensorById(int id){return service.findOpenSensorById(id);}
    public OpenSensor findOpenSensorByName(String name){ return service.findOpenSensorByName(name);}
    public String deleteOpenSensor(int id){ return service.deleteOpenSensorById(id);}
    public OpenSensor openSensor(@RequestBody OpenSensor openSensor) {return service.updateOpenSensor(openSensor);}

}

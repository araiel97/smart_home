package com.example.smart_home.service;

import com.example.smart_home.entity.OpenSensor;
import com.example.smart_home.repository.OpenSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenSensorService {
    @Autowired
    private OpenSensorRepository repository;
    public OpenSensor addOpenSensor(OpenSensor open_sensor) {return repository.save(open_sensor);}
    public List<OpenSensor> addOpenSensors(List <OpenSensor> open_sensors) {return repository.saveAll(open_sensors);}
    public List <OpenSensor> findOpenSensors() {return repository.findAll();}
    public OpenSensor findOpenSensorById(int id) {return repository.findById(id).orElse(null);}
    public String deleteOpenSensorById(int id) { repository.deleteById(id);
    return "Open Sensor removed successfully";}
    public OpenSensor findOpenSensorByName(String name){ return repository.findByName(name);}
    public OpenSensor updateOpenSensor(OpenSensor open_sensor){
        OpenSensor open_sensor_chosen = repository.findById(open_sensor.getId()).orElse(null);
        open_sensor_chosen.setName(open_sensor.getName());
        open_sensor_chosen.setAddress(open_sensor.getAddress());
        open_sensor_chosen.setRoom(open_sensor.getRoom());
        open_sensor_chosen.setState(open_sensor.getState());
        return repository.save(open_sensor_chosen);

    }

}

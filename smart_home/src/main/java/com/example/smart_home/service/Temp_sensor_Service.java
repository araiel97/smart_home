package com.example.smart_home.service;

import com.example.smart_home.entity.Temp_sensor;
import com.example.smart_home.repository.Temp_sensor_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Temp_sensor_Service {
    @Autowired
    private Temp_sensor_repository repository;
    public Temp_sensor add_sensor(Temp_sensor temp_sensor){
        return repository.save(temp_sensor);
    }
    public List<Temp_sensor> add_sensors(List<Temp_sensor> temp_sensors){
        return repository.saveAll(temp_sensors);
    }
    public Temp_sensor getTemp_SensorById(int id){
        return repository.findById(id).orElse(null);
    }
    public List<Temp_sensor> getTempSensors(){
        return repository.findAll();
    }
    public Temp_sensor getTemp_SensorByName(String name){
        return repository.findByName(name);
    }
    public String deleteTemp_sensor(int id){
        repository.deleteById(id);
        return "Temperature sensor successfully removed" + id;
    }
    public Temp_sensor updateTemp_sensor(Temp_sensor temp_sensor){
        Temp_sensor temp_sensor_chosen = repository.findById(temp_sensor.getId()).orElse(null);
        temp_sensor_chosen.setName(temp_sensor.getName());
        temp_sensor_chosen.setAddress(temp_sensor.getAddress());
        temp_sensor_chosen.setTemperature(temp_sensor.getTemperature());
        temp_sensor_chosen.setHumidity(temp_sensor.getHumidity());
        temp_sensor_chosen.setRoom(temp_sensor.getRoom());
        return repository.save(temp_sensor_chosen);
    }
}

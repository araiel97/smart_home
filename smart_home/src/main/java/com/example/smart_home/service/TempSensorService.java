package com.example.smart_home.service;

import com.example.smart_home.entity.TempSensor;
import com.example.smart_home.repository.TempSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempSensorService {
    @Autowired
    private TempSensorRepository repository;
    public TempSensor addTempSensor(TempSensor temp_sensor){
        return repository.save(temp_sensor);
    }
    public List<TempSensor> addTempSensors(List<TempSensor> temp_sensors){
        return repository.saveAll(temp_sensors);
    }
    public TempSensor findTempSensorById(int id){ return repository.findById(id).orElse(null);}
    public List<TempSensor> findAllTempSensors(){ return repository.findAll();}
    public TempSensor findTempSensorByName(String name){ return repository.findByName(name);}
    public String deleteTempSensorById(int id){ repository.deleteById(id); return "Temperature sensor successfully removed" + id;}
    public TempSensor updateTempSensor(TempSensor temp_sensor){
        TempSensor temp_sensor_chosen = repository.findById(temp_sensor.getId()).orElse(null);
        temp_sensor_chosen.setName(temp_sensor.getName());
        temp_sensor_chosen.setAddress(temp_sensor.getAddress());
        temp_sensor_chosen.setTemperature(temp_sensor.getTemperature());
        temp_sensor_chosen.setHumidity(temp_sensor.getHumidity());
        temp_sensor_chosen.setRoom(temp_sensor.getRoom());
        return repository.save(temp_sensor_chosen);
    }
}

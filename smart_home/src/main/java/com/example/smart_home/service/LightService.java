package com.example.smart_home.service;

import com.example.smart_home.entity.Light;
import com.example.smart_home.repository.LightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightService {
    @Autowired
    private LightRepository repository;
    public Light addLight(Light light){ return repository.save(light);}
    public List<Light> addLights(List<Light> lights) {return repository.saveAll(lights);}
    public List<Light> findAllLights(){ return repository.findAll();}
    public Light findLightById(int id){ return repository.findById(id).orElse(null);}
    public Light findLightByName(String name){ return repository.findByName(name);}
    public String deleteLightById(int id) { repository.deleteById(id);
    return "Light successfully removed";}
    public Light updateLight(Light light) {
        Light light_chosen;
        light_chosen = repository.findById(light.getId()).orElse(null);
        light_chosen.setName(light.getName());
        light_chosen.setAddress(light.getAddress());
        light_chosen.setRoom(light.getRoom());
        light_chosen.setState(light.getState());
        return repository.save(light_chosen);
    }

}

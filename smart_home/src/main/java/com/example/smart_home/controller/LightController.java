package com.example.smart_home.controller;

import com.example.smart_home.entity.Light;
import com.example.smart_home.service.LightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LightController {
    @Autowired
    private LightService service;
    public Light light;

    @PostMapping("/addLight")
    public Light addLight(@RequestBody Light light) {return service.add_Light(light);}
    @PostMapping("/addLights")
    public List<Light> addLights(@RequestBody List<Light> lights) {return service.add_Lights(lights);}
    @GetMapping("/Lights")
    public List<Light> findAllLights() {return service.getLights();}
    @GetMapping("/Light/{id}")
    public Light findLightById(@PathVariable int id) { return service.getLightByID(id);}
    @GetMapping("/Light{name}")
    public Light findLightByName(@PathVariable String name) { return  service.getLightByName(name);}
    @PutMapping ("/Light/update")
    public Light updateLight(@RequestBody Light light) {return service.updateLight(light);}
    @DeleteMapping ("/Light/delete/{id}")
    public String deleteLight(@PathVariable int id) {return service.deleteLightById(id);}
}

package com.example.smart_home.repository;

import com.example.smart_home.entity.Temp_sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Temp_sensor_repository extends JpaRepository<Temp_sensor,Integer> {
    Temp_sensor findByName(String name);
}

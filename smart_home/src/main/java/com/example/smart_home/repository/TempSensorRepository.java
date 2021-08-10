package com.example.smart_home.repository;

import com.example.smart_home.entity.TempSensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempSensorRepository extends JpaRepository<TempSensor,Integer> {
    TempSensor findByName(String name);
}

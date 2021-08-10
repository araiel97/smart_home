package com.example.smart_home.repository;

import com.example.smart_home.entity.OpenSensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpenSensorRepository extends JpaRepository<OpenSensor, Integer> {
    OpenSensor findByName(String name);
}

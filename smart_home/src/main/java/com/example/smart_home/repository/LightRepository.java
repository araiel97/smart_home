package com.example.smart_home.repository;

import com.example.smart_home.entity.Light;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LightRepository extends JpaRepository<Light, Integer> {
    Light findByName(String name);
}

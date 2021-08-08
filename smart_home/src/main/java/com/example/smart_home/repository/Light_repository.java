package com.example.smart_home.repository;

import com.example.smart_home.entity.Light;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Light_repository extends JpaRepository<Light, Integer> {
}

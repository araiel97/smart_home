package com.example.smart_home.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TEMP_SENSORS")

public class Temp_sensor {
    @Id
    private int id;
    private float address;
    private int room;
    private float temperature;
    private float humidity;

}

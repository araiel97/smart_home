package com.example.smart_home.entity;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tempsensors")

public class TempSensor extends Device{

    private float temperature;
    private float humidity;

}

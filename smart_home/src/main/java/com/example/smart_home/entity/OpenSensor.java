package com.example.smart_home.entity;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "opensensors")
public class OpenSensor extends Device{

    private int state;

}

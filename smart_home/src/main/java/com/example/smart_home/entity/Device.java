package com.example.smart_home.entity;

import lombok.*;

import javax.persistence.*;


@Data
@RequiredArgsConstructor
@MappedSuperclass
@AllArgsConstructor

public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String address;
    private int room;

}

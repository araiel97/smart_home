package com.example.smart_home.entity;

import lombok.*;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="lights")
public class Light extends Device{

    private int state;

}

package com.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GeoDTO {
    private double lat;
    private double lng;
}
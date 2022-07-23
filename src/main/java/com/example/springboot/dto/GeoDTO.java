package com.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GeoDTO {
    @Min(-90)
    @Max(90)
    private double lat;
    @Min(-180)
    @Max(180)
    private double lng;
}
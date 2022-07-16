package com.example.springboot.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Geo {
    private double lat;
    private double lng;

   // posts.getGeo().getLat()
   // posts.getGeo().getLng()

}

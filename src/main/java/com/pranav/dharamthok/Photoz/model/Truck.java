package com.pranav.dharamthok.Photoz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trucks")
public class Truck {

    @Id
    private String id;
    private double lat;
    private double lng;
    private String name; // Optional: name of the truck or driver

    public Truck() {}

    public Truck(String id, double lat, double lng, String name) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.name = name;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

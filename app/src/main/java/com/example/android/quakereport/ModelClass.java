package com.example.android.quakereport;

public class ModelClass {
    double magnitude;
    String Location,Date;

    public ModelClass(double magnitude, String location, String date) {
        this.magnitude = magnitude;
        Location = location;
        Date = date;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return Location;
    }

    public String getDate() {
        return Date;
    }
}

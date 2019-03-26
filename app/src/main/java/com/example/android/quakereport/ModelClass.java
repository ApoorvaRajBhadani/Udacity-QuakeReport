package com.example.android.quakereport;

public class ModelClass {
    double magnitude;
    String Location,Date,time;

    public ModelClass(double magnitude, String location, String date,String time) {
        this.magnitude = magnitude;
        Location = location;
        Date = date;
        this.time = time;
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

    public String getTime() {
        return time;
    }
}

package com.catherine.requestandpath;

import java.util.List;

public class Car {
    private String type;
    private int year;
    private List<String> features;

    public Car(){

    }

    public Car(String type, int year, List<String> features) {
        this.type = type;
        this.year = year;
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", features=" + features +
                '}';
    }
}

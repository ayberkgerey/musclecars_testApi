package com.geray.musclecars.model;

public class MuscleCar {

    private Integer id;
    private String brand;
    private String model;
    private String year;

    public MuscleCar(Integer id, String brand, String model, String year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public MuscleCar() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

package com.example.a30recyclercardview;

public class Team {
    private String name;
    private String city;
    private String country;
    private int year;
    private int logoResId; // ID del recurso drawable para el escudo

    public Team(String name, String city, String country, int year, int logoResId) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.year = year;
        this.logoResId = logoResId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getLogoResId() {
        return logoResId;
    }
}

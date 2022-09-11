package com.exercise.CountryService.model;


/**
 * a simpler country class for /countries/ REST-api
 */
public class CountryShort {

    private String name;
    private String country_code;

    public CountryShort(String name, String country_code) {
        this.name = name;
        this.country_code = country_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
}

package com.exercise.CountryService;

import com.exercise.CountryService.model.Country;

import java.util.List;

public interface CountryClient {

    List<Country> getAllCountries();

    Country getByName(String name);

}

package com.exercise.CountryService;

import com.exercise.CountryService.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class CountryClientImpl implements CountryClient {

    @Autowired
    RestTemplate restTemplate;

    private static final String ROOT_URI = "https://restcountries.com/v3.1/";

    @Override
    public List<Country> getAllCountries() {
        ResponseEntity<Country[]> response =
                restTemplate.getForEntity(ROOT_URI + "/all", Country[].class);
        return Arrays.asList(Objects.requireNonNull(response.getBody()));
    }

    @Override
    public Country getByName(String name) {
        Country[] response =
                restTemplate.getForObject(ROOT_URI + "/name/" + name, Country[].class);
        return Objects.requireNonNull(response)[0];
    }

}
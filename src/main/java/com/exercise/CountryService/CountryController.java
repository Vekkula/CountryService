package com.exercise.CountryService;

import com.exercise.CountryService.model.Country;
import com.exercise.CountryService.model.CountryShort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    /**
     * @returns list of all the countries with only name and country_code
     */
    @GetMapping("countries")
    public List<CountryShort> getCountries() {
        List<Country> countryList = CountryServiceApplication.GetAllCountries();
        List<CountryShort> countryShortList = new ArrayList<>();
        for (Country c : countryList) {
            countryShortList.add(c.toCountryShort());
        }
        return countryShortList;
    }

    /**
     * @param name name of country
     * @returns a country
     */
    @GetMapping("countries/{name}")
    public Country getCountryByName(@PathVariable(value = "name") String name) {
        return CountryServiceApplication.GetCountryByName(name);
    }
}

package com.exercise.CountryService.model;

import com.fasterxml.jackson.annotation.*;

import java.util.List;


@JsonPropertyOrder({
        "name",
        "country_code",
        "capital",
        "population",
        "flag_file_url"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    private String name;
    @JsonAlias("cca2")
    private String countryCode;
    private String capital;
    private int population;
    private String flagFileUrl;

    public Country() {

    }

    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(Name name) {
        this.name = name.getCommon();
    }

    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCapital() {
        return capital;
    }

    /**
     * @param capital name is in the first index of the List
     */
    @JsonSetter("capital")
    public void setCapital(List<String> capital) {
        if (capital != null) {
            if (capital.get(0) != null) {
                this.capital = capital.get(0);
            }
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @JsonGetter("flag_file_url")
    public String getFlagFileUrl() {
        return flagFileUrl;
    }

    /**
     * Only uses the png flag URL for simplicity
     *
     * @param flag a POJO which contains URL to PNG and SVG of country's flag
     */
    @JsonSetter("flags")
    public void setFlagFileUrl(Flag flag) {
        this.flagFileUrl = flag.getPng();
    }

    @Override
    public String toString() {
        return "county: " + "name=" + name +
                ", countryCode=" + countryCode +
                ", capital='" + capital +
                '\'' + ", population='" + population +
                '\'' + "flag url: " + flagFileUrl;
    }

    public CountryShort toCountryShort() {
        return new CountryShort(this.name, this.countryCode);
    }

}

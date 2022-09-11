package com.exercise.CountryService.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flag {

    private String png;
    private String svg;

    public Flag() {

    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }
}

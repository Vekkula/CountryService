package com.exercise.CountryService;

import com.exercise.CountryService.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class CountryServiceApplication {

    private static CountryClient client;

    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApplication.class, args);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        client = applicationContext.getBean(CountryClient.class);
    }

    public static List<Country> GetAllCountries() {
        return client.getAllCountries();
    }

    public static Country GetCountryByName(String name) {
        return client.getByName(name);
    }

}
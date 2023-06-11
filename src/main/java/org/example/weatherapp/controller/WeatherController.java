package org.example.weatherapp.controller;

import org.example.weatherapp.connector.WeatherStackConnector;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.weatherapp.City;

@RestController
public class WeatherController {
    private WeatherStackConnector weatherStackConnector;
    public WeatherController() {
        weatherStackConnector = new WeatherStackConnector();
    }
    @RequestMapping("/weather")
    String getWeather(){
        return "Weather for all cities.";
    }
    @RequestMapping("/weather/{city}")
    String getWeatherForCity(@PathVariable String city){
        City c = City.valueOf(city.toUpperCase());
        return weatherStackConnector.getWeatherForCity(c);
    }
}

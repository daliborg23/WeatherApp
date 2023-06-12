package org.example.weatherapp.service;

import org.example.weatherapp.City;
import org.example.weatherapp.connector.WeatherStackConnector;
import org.example.weatherapp.dto.WeatherDto;
import org.example.weatherapp.dto.WeatherStackDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public WeatherDto getWeatherForCity(City city) {
        WeatherStackConnector connector = new WeatherStackConnector();
        City enumCity = City.valueOf(city.toString().toUpperCase());
        WeatherStackDto wsDto = connector.getWeatherForCity(enumCity);
        return transformDto(wsDto);
    }
    private WeatherDto transformDto(WeatherStackDto wsDto){
        WeatherDto wDto = new WeatherDto();
        wDto.setLocation(wsDto.getLocation().getName());
        wDto.setHumidity(wsDto.getCurrent().getHumidity());
        wDto.setTemperature(wsDto.getCurrent().getTemperature());
        wDto.setObservation_time(wsDto.getCurrent().getObservation_time());
        wDto.setWeather_descriptions(wsDto.getCurrent().getWeather_descriptions());
        wDto.setWind_dir(wsDto.getCurrent().getWind_dir());
        wDto.setWind_speed(wsDto.getCurrent().getWind_speed());
        return wDto;
    }
}


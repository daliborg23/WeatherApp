package org.example.weatherapp.connector;

import org.example.weatherapp.City;
import org.example.weatherapp.dto.WeatherStackDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class WeatherStackConnector {
    //http://api.weatherstack.com/current?access_key=44a4d5ed4b0a589495354db4b0f8dd0b&query=Cesky%20Tesin
    private static final String baseURL = "http://api.weatherstack.com/";
    private static final String urlParams = "current?access_key=";
    private static final String APIkey = "44a4d5ed4b0a589495354db4b0f8dd0b";
    private static final String url = baseURL+urlParams+APIkey+"&query=";

    public WeatherStackDto getWeatherForCity(City city){
        URI uri = null;
        RestTemplate template = new RestTemplate();
        try {
            String encodedCity = URLEncoder.encode(city.toString(), StandardCharsets.UTF_8.toString());
            uri = new URI(url + encodedCity);
        }
        catch (Exception e) {
            System.out.println("Something is wrong!\n" + uri + "\nException: " + e.getMessage());
        }
        ResponseEntity<WeatherStackDto> response = template.getForEntity(uri, WeatherStackDto.class);
        // WeatherStackException
        return response.getBody();
    }
}

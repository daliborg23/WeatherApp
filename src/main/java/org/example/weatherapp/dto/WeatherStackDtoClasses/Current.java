package org.example.weatherapp.dto.WeatherStackDtoClasses;

import java.util.ArrayList;

public class Current {
    private String observation_time;
    private float temperature;
    private ArrayList<Object> weather_descriptions;
    private float wind_speed;
    private String wind_dir;
    private float humidity;

    // Getter Methods

    public String getObservation_time() {return observation_time;}
    public float getTemperature() {return temperature;}
    public ArrayList<Object> getWeather_descriptions() {
        return weather_descriptions;
    }
    public float getWind_speed() {return wind_speed;}
    public String getWind_dir() {return wind_dir;}
    public float getHumidity() {return humidity;}
    // Setter Methods

    public void setObservation_time(String observation_time) {this.observation_time = observation_time;}
    public void setTemperature(float temperature) {this.temperature = temperature;}
    public void setWeather_descriptions(ArrayList<Object> weather_descriptions) {
        this.weather_descriptions = weather_descriptions;
    }
    public void setWind_speed(float wind_speed) {this.wind_speed = wind_speed;}
    public void setWind_dir(String wind_dir) {this.wind_dir = wind_dir;}
    public void setHumidity(float humidity) {this.humidity = humidity;}


}

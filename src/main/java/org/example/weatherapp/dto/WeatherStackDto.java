package org.example.weatherapp.dto;

import org.example.weatherapp.dto.WeatherStackDtoClasses.Current;
import org.example.weatherapp.dto.WeatherStackDtoClasses.Location;
import org.example.weatherapp.dto.WeatherStackDtoClasses.Request;

public class WeatherStackDto {
    Request RequestObject;
    Location LocationObject;
    Current CurrentObject;


    // Getter Methods

    public Request getRequest() {
        return RequestObject;
    }

    public Location getLocation() {
        return LocationObject;
    }

    public Current getCurrent() {
        return CurrentObject;
    }

    // Setter Methods

    public void setRequest(Request requestObject) {
        this.RequestObject = requestObject;
    }

    public void setLocation(Location locationObject) {
        this.LocationObject = locationObject;
    }

    public void setCurrent(Current currentObject) {
        this.CurrentObject = currentObject;
    }
}


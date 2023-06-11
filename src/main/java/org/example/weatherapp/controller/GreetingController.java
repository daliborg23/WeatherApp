package org.example.weatherapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    //@RequestMapping("/greeting")
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    String greeting(){
        return "Hello!";
    }
}

package pl.kamil.weatherapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.kamil.weatherapi.model.MyForecast;
import pl.kamil.weatherapi.services.FetchWeatherService;

@RestController
public class WeatherController {

    @Autowired
    private FetchWeatherService weatherService;

    @GetMapping("/weather")
//    @RequestParam(value = "city", defaultValue = "London") String city,
//    @RequestParam(value = "date", defaultValue = "2023-01-01") String date,
//    @RequestParam(value = "lang", defaultValue = "en") String lang
    public MyForecast weather() {
        List<String> cities = new ArrayList<>(List.of("Warsaw", "Cracow", "Lodz", "Wroclaw", "Poznan"));
        MyForecast myForecast = new MyForecast();

        try {
//            System.out.println(weatherService.downloadWeather(cities.get(0)));
            for (String city:
                 cities) {
                myForecast.addLocation(weatherService.downloadWeather(city));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage()); //TODO: Better error handling
        }
        return myForecast;
    }
}

package pl.kamil.weatherapi.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.kamil.weatherapi.exceptions.WeatherApiException;
import pl.kamil.weatherapi.model.MyLocation;
import pl.kamil.weatherapi.model.Response;

@Service
public class FetchWeatherService {
    private final RestTemplate restTemplate = new RestTemplate();

    public MyLocation downloadWeather(String city) {
        Response quote;
        try {
            quote = getResponse(city);
        } catch (Exception e) {
            throw new WeatherApiException(e.getMessage());
        }
        assert quote != null;
        return new MyLocation(city, quote.getForecast().getForecastDays());

    }

    private String buildQuery(String city, int numberOfDays) {
        return "http://api.weatherapi.com/v1/forecast.json?key=TOKEN_HERE&q=" +
                city +
                "&days=" +
                numberOfDays +
                "&aqi=no&alerts=no";
    }

    private Response getResponse(String city) {
        return restTemplate.getForObject(
                buildQuery(city, 7), Response.class);
    }
}

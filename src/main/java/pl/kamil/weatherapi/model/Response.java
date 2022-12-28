package pl.kamil.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    Forecast forecast;

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "Response{" +
                "forecast=" + forecast +
                '}';
    }
}

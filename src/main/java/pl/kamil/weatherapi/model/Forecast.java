package pl.kamil.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    @JsonProperty("forecastday")
    List<ForecastDay> forecastDays;

    public List<ForecastDay> getForecastDays() {
        return forecastDays;
    }

    public void setForecastDays(List<ForecastDay> forecastDays) {
        this.forecastDays = forecastDays;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastDays=" + forecastDays +
                '}';
    }
}

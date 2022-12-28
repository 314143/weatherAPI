package pl.kamil.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MyLocation {
    @JsonProperty("name")
    private String name;

    @JsonProperty("days")
    private List<ForecastDay> days;

    public MyLocation(String name, List<ForecastDay> days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ForecastDay> getDays() {
        return days;
    }

    public void setDays(List<ForecastDay> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "MyLocation{" +
                "name='" + name + '\'' +
                ", days=" + days +
                '}';
    }
}

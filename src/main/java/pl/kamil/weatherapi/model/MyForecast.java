package pl.kamil.weatherapi.model;

import java.util.ArrayList;
import java.util.List;

public class MyForecast {
    private List<MyLocation> locations = new ArrayList<>();

    public List<MyLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<MyLocation> locations) {
        this.locations = locations;
    }

    public void addLocation(MyLocation locationToAdd) {
        this.locations.add(locationToAdd);
    }
}

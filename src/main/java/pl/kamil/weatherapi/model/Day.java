package pl.kamil.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty("maxtemp_c")
    private float maxTemp;

    @JsonProperty("mintemp_c")
    private float minTemp;

    @JsonProperty("avgtemp_c")
    private float avgTemp;

    @JsonProperty("maxwind_kph")
    private float maxWindKph;

    @JsonProperty("totalprecip_mm")
    private float totalPrecipMm;

    public float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public float getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(float avgTemp) {
        this.avgTemp = avgTemp;
    }

    public float getMaxWindKph() {
        return maxWindKph;
    }

    public void setMaxWindKph(float maxWindKph) {
        this.maxWindKph = maxWindKph;
    }

    public float getTotalPrecipMm() {
        return totalPrecipMm;
    }

    public void setTotalPrecipMm(float totalPrecipMm) {
        this.totalPrecipMm = totalPrecipMm;
    }

    @Override
    public String toString() {
        return "Day{" +
                "maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", avgTemp=" + avgTemp +
                ", maxWindKph=" + maxWindKph +
                ", totalPrecipMm=" + totalPrecipMm +
                '}';
    }
}

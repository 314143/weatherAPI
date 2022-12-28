package pl.kamil.weatherapi.exceptions;

public class WeatherApiException extends RuntimeException {
    public WeatherApiException(String message) {super("Error while downloading data. Message from WeatherAPI:\n" + message);}
}

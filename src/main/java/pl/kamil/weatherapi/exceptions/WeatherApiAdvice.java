package pl.kamil.weatherapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WeatherApiAdvice {
    @ResponseBody
    @ExceptionHandler(WeatherApiException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    String competitionNotFoundHandler(WeatherApiException ex) {
        return ex.getMessage();
    }
}

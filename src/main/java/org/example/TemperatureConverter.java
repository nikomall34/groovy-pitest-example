package org.example;

public class TemperatureConverter {
    public int celsiusToFahrenheit(int celsius) {
        return (celsius * 9/5) + 32;
    }

    public int fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

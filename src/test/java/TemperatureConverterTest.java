import org.example.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void celsiusToFahrenheitTest() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertThat(temperatureConverter.celsiusToFahrenheit(25)).isSameAs(77);
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertThat(temperatureConverter.fahrenheitToCelsius(77)).isSameAs(25);
    }
}
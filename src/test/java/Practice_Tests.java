import org.example.TemperatureHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Practice_Tests {

    @Test
    void temperatureTest(){

        assertEquals(223.88888888888889, TemperatureHelper.fahrenheitToCelsius(435));
        assertEquals(417.2, TemperatureHelper.celsiusToFahrenheit(214));

    }

}

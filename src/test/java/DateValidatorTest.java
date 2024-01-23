import org.example.DateValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DateValidatorTest {
    private static final String customFormat = "yyyy-MM-dd";
    @Test
    public void validDateTest() {
        String validDate = "2022-01-23";
        DateValidator dateValidator = new DateValidator();
        assertThat(dateValidator.isValidDateFormat(validDate, customFormat)).isTrue();
    }

    @Test
    public void invalidDateTest() {
        String invalidDate = "2022-02-30";
        DateValidator dateValidator = new DateValidator();
        assertThat(dateValidator.isValidDateFormat(invalidDate, customFormat)).isFalse();
    }
}

import org.example.StringManipulator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringManipulatorTest {

    @Test
    public void reverseStringTest() {
        String originalString = "Hello, World!";
        StringManipulator stringManipulator = new StringManipulator();
        assertThat(stringManipulator.reverseString(originalString)).isEqualTo("!dlroW ,olleH");
    }

    @Test
    public void countVowels() {
        String textWithVowels = "This is a sample text with vowels";
        StringManipulator stringManipulator = new StringManipulator();
        assertThat(stringManipulator.countVowels(textWithVowels)).isSameAs(9);

    }
}

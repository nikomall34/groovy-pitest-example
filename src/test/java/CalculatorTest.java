import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void TestAdd() {
        Calculator calc = new Calculator();
        assertThat(calc.add(5, 4)).isSameAs(9);
    }

    @Test
    public void TestSub() {
        Calculator calc = new Calculator();
        assertThat(calc.sub(5, 4)).isSameAs(1);
    }

    @Test
    public void TestMul() {
        Calculator calc = new Calculator();
        assertThat(calc.mul(5, 4)).isSameAs(20);
    }

    @Test
    public void TestDiv() {
        Calculator calc = new Calculator();
        assertThat(calc.div(4, 2)).isSameAs(2);
    }
}

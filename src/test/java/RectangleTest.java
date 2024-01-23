import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testLength() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertThat(rectangle.getLength()).isSameAs(5);
    }

    @Test
    public void tetsWidth() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertThat(rectangle.getWidth()).isSameAs(3);
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertThat(rectangle.calculatePerimeter()).isSameAs(16);
    }

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(5, 3);
        assertThat(rectangle.calculateArea()).isSameAs(15);
    }
}

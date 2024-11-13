import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiscountCalculationTest {

    public double calculateDiscount(double price, double discountPercentage) {
        return price - (price * (discountPercentage / 100));
    }

    @Test
    public void testDiscountCalculation() {
        double result = calculateDiscount(100.0, 10.0); // Precio real y descuento
        assertEquals(90.0, result, 0.001);
    }
}

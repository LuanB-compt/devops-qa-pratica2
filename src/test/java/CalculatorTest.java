import org.junit.jupiter.api.Test;
import org.valueprojects.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void shouldAddTwoNumbers() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.add(10.5, 5.5);

        // Assert
        assertEquals(16.0, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.subtract(10.0, 5.0);

        // Assert
        assertEquals(5.0, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.multiply(10.0, 5.0);

        // Assert
        assertEquals(50.0, result);
    }

    @Test
    void shouldDivideTwoNumbers() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.divide(10.0, 2.0);

        // Assert
        assertEquals(5.0, result);
    }

    @Test
    void shouldThrowExceptionWhenDivisorIsZero() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act + Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10.0, 0.0)
        );
    }


}
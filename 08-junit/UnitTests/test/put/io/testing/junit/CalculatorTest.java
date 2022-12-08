package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(30, calculator.add(25, 5));
        assertEquals(35, calculator.add(42, -7));
    }

    @Test
    public void testMultiply() {
        assertEquals(125, calculator.multiply(25, 5));
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testAddPositiveNumbers(){
        assertThrows(IllegalArgumentException.class, () -> {calculator.addPositiveNumbers(-3, 6);});
        //assertEquals(35, c.addPositiveNumbers(42, -7));
    }
}

//Pytanie 3.1: przestałyby działać, bo BeforeAll jest z innego JUnita
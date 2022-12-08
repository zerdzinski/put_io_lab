package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AudiobookPriceCalculatorTest {
    private Customer c;
    private Audiobook a;
    private AudiobookPriceCalculator ac;
    @BeforeEach
    public void setUp(){
        a = new Audiobook("Silmarillion", 35);
        ac = new AudiobookPriceCalculator();
    }

    @Test
    public void test1(){
        c = new Customer("Kuba", Customer.LoyaltyLevel.STANDARD, true);
        assertEquals(0.0, ac.calculate(c, a));
    }
    @Test
    public void test2(){
        c = new Customer("Kuba", Customer.LoyaltyLevel.SILVER, false);
        assertEquals(0.9*a.getStartingPrice(), ac.calculate(c, a));
    }
    @Test
    public void test3(){
        c = new Customer("Kuba", Customer.LoyaltyLevel.GOLD, false);
        assertEquals(0.8*a.getStartingPrice(), ac.calculate(c, a));
    }
    @Test
    public void test4(){
        c = new Customer("Kuba", Customer.LoyaltyLevel.STANDARD, false);
        assertEquals(a.getStartingPrice(), ac.calculate(c, a));
    }

}
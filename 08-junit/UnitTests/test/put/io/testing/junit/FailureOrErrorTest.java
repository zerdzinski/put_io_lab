package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FailureOrErrorTest {
    @Test
    public void test1(){
        assertEquals(1, 0);
    }
    @Test
    public void test2() throws Exception {
        throw new Exception("exception");
    }
    @Test
    public void test3(){
        try {
            assertEquals(1, 0);
        }
        catch (Throwable e) {
            System.out.println(e.toString());
        }
    }
}

//Pytanie 4.1: test1 zostanie oznaczony jako failure a test 2 jako error
//Pytanie 4.2: oczekuje na AssertionFailedError
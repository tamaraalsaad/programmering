package fibonacci;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciHashMapTest {
    @Test
    void FerstNammber(){
        assertEquals (BigInteger.ZERO,FibonacciHashMap.fibonacci(1));
    }
    @Test
    void secondNammber(){
        assertEquals(BigInteger.ONE,FibonacciHashMap.fibonacci(2));
    }
    @Test
    void fordNammber(){
        assertEquals(new BigInteger("2"),FibonacciHashMap.fibonacci(4));
    }
    @Test
    void namber100(){
        assertEquals(new BigInteger("218922995834555169026"),FibonacciHashMap.fibonacci(100));
    }
}

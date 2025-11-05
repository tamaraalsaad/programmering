package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciArrayListTest {
    @Test
    void firstTenNambersAreCorrect(){
        ArrayList<BigInteger>expected=new ArrayList<>();
        expected.add(BigInteger.ZERO);
        expected.add(BigInteger.ONE);
        expected.add(BigInteger.ONE);
        expected.add(new BigInteger("2"));
        expected.add(new BigInteger("3"));
        expected.add(new BigInteger("5"));
        expected.add(new BigInteger("8"));
        expected.add(new BigInteger("13"));
        expected.add(new BigInteger("21"));
        expected.add(new BigInteger("34"));

        assertEquals(expected, FibonacciArrayList.fiboacciList(10));
    }
    @Test
    void LastNamber100(){
        ArrayList<BigInteger>fib100= FibonacciArrayList.fiboacciList(100);
        assertEquals(new BigInteger("218922995834555169026"),fib100.get(99));

    }

    }


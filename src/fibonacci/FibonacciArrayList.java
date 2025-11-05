package fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciArrayList {
    public static ArrayList<BigInteger> fiboacciList(int n) {
        ArrayList<BigInteger> fib = new ArrayList<>();
        if (n <= 0) return fib;
        fib.add(BigInteger.ZERO);
        if (n == 1) return fib;
        fib.add(BigInteger.ONE);
        for (int i = 2; i < n; i++) {
            BigInteger next = (fib.get(i - 1).add(fib.get(i - 2)));
            fib.add(next);
        }
        return fib;


    }

    static void main() {
        ArrayList<BigInteger> result = fiboacciList(100);
        System.out.println(result);
        System.out.println("f(100)" + result.get(99));
    }


}

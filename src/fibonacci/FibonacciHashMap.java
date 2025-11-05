package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;

public class FibonacciHashMap {
    public static BigInteger fibonacci(int n) {
        HashMap<Integer, BigInteger> fibHashMap = new HashMap<>();
        fibHashMap.put(1, BigInteger.ZERO);
        fibHashMap.put(2, BigInteger.ONE);
        if (n == 1 || n == 2) {

            return fibHashMap.get(n);
        }
        for (int i = 3; i <= n; i++) {
            BigInteger fHM1 = fibHashMap.get(i - 1);
            BigInteger fHM2 = fibHashMap.get(i - 2);
            fibHashMap.put(i, fHM1.add(fHM2));
        }

        return fibHashMap.get(n);

    }

    static void main() {
        System.out.println("f(1)=" + fibonacci(1));
        System.out.println("f(2)=" + fibonacci(2));
        System.out.println("f(100)=" + fibonacci(100));
    }
}

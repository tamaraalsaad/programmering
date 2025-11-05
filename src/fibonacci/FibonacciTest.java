package fibonacci;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FibonacciTest {
    @Test
    void fibonacci1(){
        assertEquals(0,Fibonacci.fibonacci(1));
    }
    @Test
    void fibonacci2(){
        assertEquals(1,Fibonacci.fibonacci(2));
    }
    @Test
    void fibonacci3(){
        assertEquals(1,Fibonacci.fibonacci(3));
    }
    @Test
    void fibonacci4(){
        assertEquals(2,Fibonacci.fibonacci(4));
    }
    @Test
    void fibonacci10(){
        assertEquals(34,Fibonacci.fibonacci(10));
    }
   // @Test
  //  void fibonacci99(){
     // assertEquals(90618175, Fibonacci.fibonacci(99));
    //}




    }

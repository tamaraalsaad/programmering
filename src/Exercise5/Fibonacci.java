package Exercise5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the order of fiboncci you want:");
        try {

            int number = Integer.parseInt(scan.nextLine());
            //int[] fibonacci = new int[40];
            ArrayList<Integer> fibonacci = new ArrayList<Integer>();

            fibonacci.add(1);
            fibonacci.add(1);
            for (int i = 2; i < number; i++) {
                //det senaste talet och det näst senaste talet
                //if (fibonacci.get(i - 1) > Integer.MAX_VALUE - fibonacci.get(i - 2)) {
                  //  System.out.println("Overflow! Talet är för stort för int.");

                   // break;

               // }
                fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
                System.out.println(fibonacci.get(number - 1));
            }

        } catch (Exception e) {
            System.out.println("fel nummer");
        }
    }}

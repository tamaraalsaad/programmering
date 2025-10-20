import java.util.Scanner;

public class fibonacci3 {
    public static void main(String[] args) {
        //Uppdatera ditt program så att det fortsätter att be om nya
        // Fibonacci-tal att skriva ut efter varje input ifrån användaren

        // Uppdatera ditt program så att det fångar alla möjliga fel och istället
        // ber användaren att skriva in ett nytt tal om man skrivit in fel
        boolean incorrectFibonacci = true;
        while (incorrectFibonacci) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Write the order of fiboncci you want:");
            try {
                int number = Integer.parseInt(scan.nextLine());
                int[] fibonacci = new int[40];
                fibonacci[0] = 1;
                fibonacci[1] = 1;
                for (int i = 2; i < 40; i++) {
                    //det senaste talet och det näst senaste talet
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

                }

                System.out.println("The correspond to :");
                System.out.println(fibonacci[number - 1]);
                incorrectFibonacci = false;

                incorrectFibonacci = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                incorrectFibonacci = true;
                System.out.println("Please write a number between 1-40 and don't make to high or too low");
            } catch (NumberFormatException e) {
                incorrectFibonacci = true;
                System.out.println("Please write a number between 1-40 and don't write in decimal or with letters ");
            } catch (Exception e) {
                incorrectFibonacci = true;
                System.out.println("Please write a number between 1-40");


            }

        }
    }
}



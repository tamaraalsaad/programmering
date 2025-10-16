import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        //Se till så att vi kan läsa in vilket Fibonacci-tal som vi
        // ska hitta med hjälp av Scanner (dvs. Modifiera den färdiga Fibonacci-Klassen)
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the order of fiboncci you want:");
        try {
            int number = Integer.parseInt(scan.nextLine());


            int[] fibonacci = new int[40];
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            for (int i = 2; i < 40; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

            }
            System.out.println("The correspond to :");
            System.out.println(fibonacci[number - 1]);
        } catch (Exception e) {

            {
                System.out.println("Please write a number between 1-40");

                // Uppdatera ditt program så att det fångar ett fel
                // och inte avbryter (dvs. det skrivs inte ut ett exception i terminalen)


            }
        }
    }
}

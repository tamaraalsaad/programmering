import java.util.InputMismatchException;
import java.util.Scanner;

public class ovning2 {
        public static void main(String[] args) {
            String[] names = {"Ada", "Beda", "Cålle"};
            Scanner scen = new Scanner(System.in);
            int index = -1;

            try {
                System.out.print("Ange ett tal mellan 0 och " + (names.length - 1) + ": ");
                index = scen.nextInt();  // Kan kasta InputMismatchException
            } catch (InputMismatchException e) {
                System.out.println("Fel: Du måste skriva ett heltal!");

            }

            try {
                System.out.println("Namnet på plats " + index + " är: " + names[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Fel: Indexet är utanför tillåtet intervall!");
            } catch (Exception e) {
                System.out.println("Ett oväntat fel inträffade: " + e.getMessage());
            }

        }
    }


import java.util.InputMismatchException;
import java.util.Scanner;

public class ovning5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputMismatchCount = 0;
        int indexOutOfBoundsCount = 0;
        int[] tal = new int[5];
        System.out.println("Skriva in 5 heltal.Skriva stop när som helst");
        int i = 0;
        while (i < tal.length) {
            System.out.println("tal" + " " + (i + 1) + " " + "av 5:");
            if (scan.hasNext("stop")) {
                System.out.println("Du vald att avsluta.");
                return;
            }
            try {
                tal[i] = scan.nextInt();
                i++;
            } catch (InputMismatchException e) {
                inputMismatchCount++;
                String felToken = scan.next();
                System.out.println("Fel: '" + felToken + "' är inte ett heltal. Försök igen.");
            }
        }
        System.out.println("Klart! Dina tal är inlästa.");
        System.out.println("Du kan nu läsa ut valfritt index [0..4]. Skriv 'stop' för att avsluta.");

        while (true) {
            System.out.print("Välj index (0–4) eller skriv 'stop': ");
            if (scan.hasNext("stop")) {
                System.out.println("Du valde att avsluta.");
                printStatsAndExit(inputMismatchCount, indexOutOfBoundsCount);
                return;
            }
            try {
                int index = scan.nextInt();
                try {
                    int varde = tal[index];
                    System.out.println("tal[" + index + "] = " + varde + " ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    indexOutOfBoundsCount++;
                    System.out.println("Fel: Ogiltigt index " + index + ". Giltiga index är 0 till 4. Försök igen.");
                }
            } catch (InputMismatchException e) {
                inputMismatchCount++;
                String felToken = scan.next();
                System.out.println("Fel: '" + felToken + "' är inte ett heltal. Ange ett heltal mellan 0 och 4.");
            }
        }
    }
    private static void printStatsAndExit(int inputMismatchCount, int indexOutOfBoundsCount) {
        System.out.println("---- Statistik över felaktig input ----");
        System.out.println("InputMismatchException (ej heltal): " + inputMismatchCount + " gång(er)");
        System.out.println("ArrayIndexOutOfBoundsException (ogiltigt index): " + indexOutOfBoundsCount + " gång(er)");
        System.out.println("Programmet avslutas. Hej då!");
    }
}


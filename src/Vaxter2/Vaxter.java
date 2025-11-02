package Vaxter2;

import java.util.Scanner;

public class Vaxter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        VaxtLista.Plants[] lista = new VaxtLista.Plants[5];
        int antal = 0;

        System.out.println("Skriv in upp till 5 växter (skriv 'stop' som namn för att avsluta):");

        while (antal < lista.length) {
            System.out.print("Skriv växtens namn: ");
            String namn = scan.nextLine();
            if (namn.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Skriv växtens höjd i meter: ");
            double hojd = Double.parseDouble(scan.nextLine());

            System.out.print("Skriv plats: ");
            String plats = scan.nextLine();

            lista[antal] = new VaxtLista.Plants(namn, hojd, plats);
            antal++;

            System.out.println();
        }

        System.out.println("Du skapade följande växter:");
        for (int i = 0; i < antal; i++) {
            lista[i].visaInfo();
        }
    }
}


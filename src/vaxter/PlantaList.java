package vaxter;

import java.util.Scanner;

public class PlantaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Plants[] plants = new Plants[5];
        System.out.println("Skapa växter (skriv 'stop' som namn för att avsluta");
        while (true) {
            System.out.println("Skriv växtens namn: ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop"))
                break;

            System.out.println("Ange plats:");
            String place = scan.nextLine();
            System.out.println("Ange storlik");
            double size = Double.parseDouble(scan.nextLine());
            System.out.println("Ange typ");
            String type=scan.nextLine();

        }

        System.out.println("Du skapade följande objekt");
        for (Plants plant : plants) {
            plant.showInfo();
            System.out.println();


        }
    }
}





package Exercise5.Aege;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vecka3C {
    public static void main(String[] args) {
       // Skapa en HashMap för att lagra namn och ålder.
        // Lägg till några namn och deras motsvarande ålder.
       // Uppdatera programmet så att det skriver ut åldern
        // på det namn man har läst in med Scanner och som
        // matchar namn lagrade i din HashMap
       // Skapa en ny klass som innehåller en metod med en
        // HashMap för att lagra namn och ålder.
        // Lägg till några namn och deras motsvarande ålder.
        // Metoden ska returnera en ålder beroende på
        // vilket namn man har som inparameter.
        // Skapa metoden med TDD

        Map<String ,Integer>ages=new HashMap<>();
        Scanner scan =new Scanner(System.in);
        ages.put("Josef",13);
        ages.put("Nadin",18);
        ages.put("Adam",20);
        ages.put("Sara",50);
        for (int i =0; i<1;i++){
           String name=scan.nextLine();
            System.out.println(ages.get(name));
        }


    }

}

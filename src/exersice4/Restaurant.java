package exersice4;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
       /* Sausage s = new Sausage();
        s.serve();
        s.order();
        Meal m = new Sausage();
        m.order();
        m.serve();
       */
        Scanner sacan = new Scanner(System.in);
        Meal[] meals = new Meal[5];
        for (int i = 0; i < meals.length; i++) {
            System.out.println("What is yor order?");
            String food = sacan.nextLine();
            if (food.equals("icecrem")) {
                meals[i] = new IceCream();
                System.out.println("Du you want sprinkles Y/N");
                if (sacan.nextLine().equals("Y")) {
                    ((IceCream) meals[i]).addSprinkles();
                }

            } else {
                meals[i] = new Sausage();
                System.out.println("Do you want Ketchup Y/N");
                if (sacan.nextLine().equals("Y")) {
                    ((Sausage) meals[i]).addKetchup();
                }
            }
        }

            for (int i = 0; i < meals.length; i++) {
                meals[i].kindOfFood();
                meals[i].serve();
            }
                // Utöka Restaurantklassen så att man ifrån
                // konsolen bestämmer om man skall beställa en glass
                // eller en korv


                //Beräkna kostnaden för varje glass och korv
                //En glass kostar 20 kr
               // En korv kostar 15 kr
                //Lägga på ketchup kostar 2 kr
                //Lägga på strössel kostar 5 kr
               // Vad blir totalsumman efter att du har serverat?
               int totalPrice=0;
                for (int i = 0; i < meals.length; i++) {
                  totalPrice +=  meals[i].getPrice();
                }
        System.out.println("The total price is "+totalPrice);
            }
        }




package exersice4;

public class Sausage extends Meal {

    public Sausage(){
        price=15;

    }


    public void serve() {
        System.out.println("It is served in a bun");
    }
    public void kindOfFood() {
        System.out.println();
        System.out.println("Sausage");
    }
    public void addKetchup(){
        System.out.println("Add Ketchup");
        price+=2;
    }

    }
    //Lägg till en metod addKetchup() enbart
    // i klassen Sausage och addSprinkles i klassen IceCream

    //Hur gör vi om vi vill att ett Sausageobjekt som ingår i vår array Meals ska använda metoden?

    //Tips: Typkonvertering

    //  ((Sausage) meals[i]).addKetchup();





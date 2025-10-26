package exersice4;

public class IceCream extends Meal{

    public IceCream(){
        price=20;
    }
    public void serve(){
        System.out.println("It is served in a cone ");
    }

    public void kindOfFood() {
        System.out.println();
        System.out.println("Ice cream");
    }
    public void addSprinkles(){
        System.out.println("Add Sprinkles");
        price+=5;
    }

    }
    //Lägg till en metod addKetchup() enbart
    // i klassen Sausage och addSprinkles i klassen IceCream

    //Hur gör vi om vi vill att ett Sausageobjekt som ingår i vår array Meals ska använda metoden?

   //Tips: Typkonvertering

          //  ((Sausage) meals[i]).addKetchup();



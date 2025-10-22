import java.util.InputMismatchException;
import java.util.Scanner;

public class oving4try {
    public static void main(String[] args) {
        //Skriv ett program som läser in två tal och sedan skriver ut kvoten mellan
        // dem (dvs. utför division mellan de två talen)

        // Fånga felen och skriv ut ett felmeddelande

        // Uppdatera så att meddelandet i Exception e även kommer med
        //7. Uppdatera programmet så att inläsning upprepas till dess att man har korrekta värden
        //
        //8. Uppdatera programmet så att man enbart behöver läsa in det värde som inte är
        // korrekt (om enbart ett av dem är inkorrekt)
        double taljara,nammar;
        boolean nammarCorrect = false;
        boolean taljaraCorrect=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("skriv in två tal ");
        while (!nammarCorrect||!taljaraCorrect)
       {
            try {
                if(! nammarCorrect){
                System.out.println("first number:");
                double num1 = scan.nextDouble();
                System.out.println("Second number:");
                double num2 = scan.nextDouble();
                double quotient = num1 / num2;
                System.out.println("The quotient is " + quotient);
            } }catch (ArithmeticException e) {
                System.out.println("Fel: du försökte dela med noll.");
            } catch (InputMismatchException e) {
                System.out.println("Fel: du måste skriva in siffror, inte bokstäver.");
            } catch (Exception e) {
                System.out.println("felmeddelanda");
            }


        }
    }
}

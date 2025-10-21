import java.util.InputMismatchException;
import java.util.Scanner;

public class ovning1 {
    public static void main(String[] args) {

        // Följande array finns i ditt program:
        // String[] names = {"Ada", "Beda", "Cålle"};

        //1. Läs in ett tal som beskriver vilket namn man
        // skall skriva ut i ordningen. Fånga eventuella exceptions

        //  2. Uppdatera ditt program så att det fångar exceptions
        //  vid olika tillfällen (inläsning av tal respektive utskrift av namn)
            String[] nams = {"Ada", "Beda", "Cålle"};
            Scanner scan =new Scanner(System.in);
        System.out.println("Skriv in seffra");

            int i= scan.nextInt();
            try {
                System.out.println( nams[i-1]);
            }catch (ArrayIndexOutOfBoundsException aiode){
                System.out.println("något gick fel" + aiode);
            }




            }
        }



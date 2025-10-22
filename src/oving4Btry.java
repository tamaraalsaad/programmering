import java.util.Scanner;

public class oving4Btry {
    public static void main(String[] args) {
        double taljare=0, namnare=1;

        boolean namnareCorrect = false;
        boolean taljareCorrect = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in två tal");
        while (!namnareCorrect || !taljareCorrect) {
            try {
                if (!taljareCorrect){
                    System.out.print("Skriv in tälaren:");
                    taljare = Double.parseDouble(scan.nextLine());
                    taljareCorrect= true;
                }
                if (!namnareCorrect) {
                    System.out.print("Skriv in nämnaren");
                    namnare = Double.parseDouble(scan.next());
                    if (namnare !=0)  {
                        namnareCorrect = true;
                    } else System.out.println("ej ok att dela med 0");
                }
            } catch (Exception e) {
                // NumberFormatException
                System.out.println("Vi fick ett fel "+e);
            }
        }
        System.out.println("Kvoten är: "+(taljare/namnare));
    }
}

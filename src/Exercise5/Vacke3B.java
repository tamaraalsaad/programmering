package Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Vacke3B {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String>nameList=new ArrayList<>();
        System.out.println("Skriva in name(skriva 'stop'för avsluta):");
        while (true){
            String name=scan.nextLine();
            if (name.equals("stop")){
                break;
            }
            nameList.add(name);
        }
        System.out.println("alla name");
        for (String n:nameList){
            System.out.println(n);
        }
        if (! nameList.isEmpty()) {
            System.out.println("skriva nytt namn på första platsen  ");
            String nyttName = scan.nextLine();
            nameList.set(0, nyttName);
        }
        if (nameList.size()>1) {
            String först = nameList.get(0);
            String siste = nameList.get(nameList.size() - 1);
            nameList.set(0, siste);
            nameList.set(nameList.size() - 1, först);
        }
        System.out.println("Uppdeterad lista :");
        for (String n:nameList){
            System.out.println(n);


        }
    }

}

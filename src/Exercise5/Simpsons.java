package Exercise5;

import java.util.HashMap;
import java.util.Scanner;

public class Simpsons {
    public static void main(String[] args) {
        HashMap<String, String> simpsons = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        simpsons.put("Homer", "D’oh!");
        simpsons.put("Marge", "Mmm~mmmmm");
        simpsons.put("Bart", "¡Ay, caramba !");
        simpsons.put("Lisa", "If anyone wants me, I 'll be in my room.");
        simpsons.put("Maggie", "(Pacifier Suck)");
        simpsons.put("Ned", "Hi -Diddily - Ho !");
        simpsons.put("Burns", "Excellent !");
        simpsons.put("Edna", " Ha !");
        simpsons.put("Chalmers", "SEEEEYYYMOOUURRR !");
        simpsons.put("Apu", "Thank You, Come Again !");
        simpsons.put("Stu", " Disco Stu likes disco music.");
        for (int i = 0; i < 5; i++) {
            String name = scan.nextLine();
            System.out.println(simpsons.get(name));

        }
    }

}

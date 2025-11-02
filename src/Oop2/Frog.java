package Oop2;

public class Frog {
    private String name;
    private int age;

    public Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showName() {
        System.out.println("The forg's name is :" + name);
    }

    public void jump(double length, int numberOfJumps) {
        double totalDistance = length * numberOfJumps;
        System.out.println(name + " jumps " + numberOfJumps + " times, " +
                "each jump is " + length + " meters long.");
        System.out.println("Total distance jumped: " + totalDistance + " meters");
    }

    public void aeg() {
        System.out.println("The age is:" + age);
    }
}

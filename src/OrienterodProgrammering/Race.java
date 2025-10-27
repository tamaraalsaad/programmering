package OrienterodProgrammering;

public class Race {
    public static void main(String[] args) {
        System.out.println("Car test");
        car myCar=new car();
        myCar.increaseSpeed(50);
        myCar.showSpeed();
        myCar.increaseSpeed(30);
        myCar.showSpeed();
        System.out.println();
        System.out.println("Bicycle Test");
        Bicycle myBik=new Bicycle();
        myBik.nbrOfGears(5);
        myBik.setGear(2);
        myBik.increaseSpeed(3);
        myBik.increaseSpeed(4);
        myBik.showSpeed();

    }
}

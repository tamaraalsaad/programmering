package OrienterodProgrammering;

public class Bicycle extends Vehicle {
    private int gears;
    private int currentGear = 1;

    public void nbrOfGears(int nbr) {
        this.gears = nbr;
        System.out.println("Bicycle has " + gears + " gears.");
    }

    public void setGear(int gear) {
        if (gear >= 1 && gear < gears) {
            currentGear = gear;
            System.out.println("Gear changed to " + currentGear);
        } else {
            System.out.println("Invalid gear number!");
        }
    }

    public void increaseSpeed(int force) {
        int addedSpeed = force * currentGear;
       super.speed += addedSpeed;
        System.out.println("You pedaled with force " + force + " on gear " + currentGear +
                " → speed increased by " + addedSpeed + " km/h");

    }

}

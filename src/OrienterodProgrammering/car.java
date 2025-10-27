package OrienterodProgrammering;

public class car extends Vehicle{
    public void increaseSpeed(int increment){
        speed+=increment;
        System.out.println("speed increasd by:" + increment +"km/h");
    }
}

package Oop2;

public class Dog  {
    private String name;
    public Dog(String name){
        this.name=name;
    }
    public void showName(){
        System.out.println("The dog's name is : "+name);
    }
    public void bark(){
        System.out.println("barking...");
    }
}

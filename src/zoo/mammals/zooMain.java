package zoo.mammals;

import zoo.birds.Eagle;

public class zooMain {
    public static void main(String[] args) {


        Eagle eagle = new Eagle();
        eagle.Eagle("Shahin", "rator",5);
        System.out.println(eagle.getName());
        System.out.println(eagle.getMat());
        System.out.println(eagle.getAge());


        Dog myDog = new Dog();
        myDog.Dog("Ralf","hund mat");
        System.out.println(myDog.getMat());
        System.out.println(myDog.getName());


    }
}

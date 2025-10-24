package exersice4;

public class Restaurant {
    public static void main(String[] args) {
        Sausage s = new Sausage();
        s.serve();
        s.order();
        Meal m = new Sausage();
        m.order();
        m.serve();
        Meal[] meals=new Meal[5];
        meals[0]=new Sausage();
        meals[1]=new IceCream();
        meals[2]=new Sausage();
        meals[3]=new IceCream();
        meals[4]=new Sausage();
        for (int i = 0; i < meals.length; i++) {
            meals[i].kindOfFood();
            meals[i].serve();


        }
    }
}

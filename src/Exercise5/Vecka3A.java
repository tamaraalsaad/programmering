package Exercise5;

import java.util.ArrayList;

public class Vecka3A {
    public static void main(String[] args) {
        ArrayList<Double>matalista=new ArrayList<>() ;
        matalista.add(3.1415926535);
        matalista.add(2.7182818284);
        matalista.add(1.4142135623);
        matalista.add(1.6180339887);
        matalista.add(2.3025850929);
        ArrayList<String>names=new ArrayList<>();
        names.add("pi");
        names.add("e");
        names.add("sqrt2");
        names.add("phi");
        names.add("In10");
        for ( int i=0;i<matalista.size();i++){
            System.out.println(names.get(i)+"="+matalista.get(i));
        }
    }
}

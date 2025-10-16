public class arrya {
    public static void main(String[] args) {

        String[] names = {"Adam", "Tamara", "Nadin", "Josef", "Ammar"};
        System.out.println(names[0]);
        System.out.println(names[4]);
        names[0] = "Amanda";
        System.out.println(names[0]);
        System.out.println(names[1]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        String myString = "hej på dig";
        String[] stringsArray = myString.split(" ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(stringsArray[i]);


        }
    }
}

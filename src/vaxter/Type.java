package vaxter;

class Type extends Plants{
   String type;



    public Type(String name, String type) {
        super(name);
        this.type = type;

    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Type"+type);
    }
}

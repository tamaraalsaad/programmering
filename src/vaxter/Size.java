package vaxter;

class Size extends Plants {

    double size;

    public Size(String name, double size) {
        super(name);

        this.size = size;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Size: " + size + " m");

    }
}

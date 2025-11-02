package Vaxter2;

public class VaxtLista {
    static class Plants {
        String namn;
        double hojd;
        String plats;

        public Plants(String namn, double hojd, String plats) {
            this.namn = namn;
            this.hojd = hojd;
            this.plats = plats;
        }

        public void visaInfo() {
            System.out.println("Namn: " + namn + ", Höjd: " + hojd + " m, Plats: " + plats);
        }
    }
}


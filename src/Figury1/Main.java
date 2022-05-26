package Figury1;

public class Main {
    public static void main(String[] args) {
        double f;
        Pryamougolnik pryamougolnik = new Pryamougolnik();
        Pryamougolnik pryamougolnik1 = new Pryamougolnik();
        Krug krug = new Krug();
        Krug krug1 = new Krug();
        Treugolnik treugolnik = new Treugolnik();
        Figury[] figuries = new Figury[10];


        pryamougolnik.s();
        pryamougolnik1.s();
        krug.s();
        krug1.s();
        treugolnik.s();

        pryamougolnik.p();
        pryamougolnik1.p();
        krug.p();
        krug1.p();
        treugolnik.p();


        figuries [0] = pryamougolnik;
        figuries [1] = pryamougolnik1;
        figuries [2] = krug;
        figuries [3] = krug1;
        figuries[4] = treugolnik;

        for (int i = 0; i < 5; i++) {
            figuries[i].connect();
            f = pryamougolnik.p + pryamougolnik1.p + krug.p + krug1.p + treugolnik.p;
            System.out.println(f);
        }
    }
}
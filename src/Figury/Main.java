package Figury;

public class Main {
    public static void main(String[] args) {
        double f=0d;
        Pryamougolnik pryamougolnik = new Pryamougolnik(4,6);
        Pryamougolnik pryamougolnik1 = new Pryamougolnik(5,6);
        Krug krug = new Krug(8);
        Krug krug1 = new Krug(8);
        Treugolnik treugolnik = new Treugolnik(6,8,7);
        Figury[] figuries = new Figury[10];




        figuries [0] = pryamougolnik;
        figuries [1] = pryamougolnik1;
        figuries [2] = krug;
        figuries [3] = krug1;
        figuries [4] = treugolnik;

        for (int i = 0; i < 5; i++) {
            f = f + figuries[i].perimetr();
        }
        System.out.println(f);
    }
}
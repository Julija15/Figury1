package Figury;

public class Krug extends Figury {

    double pi = Math.PI;
    int r;

    @Override
    public void squery() {
        double p1 = 2 * pi * r;
        System.out.println("p = " + p1);
    }

    @Override
    public double perimetr() {
        double t = pi * r * r;
        System.out.println("s=" + t);
        return t;
    }

    public Krug(int r) {
        this.r = r;
    }
}

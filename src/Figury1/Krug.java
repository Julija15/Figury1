package Figury1;

public class Krug {
    double s;
    double p;
    double pi;
    int r;

    @Override
    public void s() {
        s = pi * r * r;
        System.out.println(" Площадь круга = " + s);
        }

    @Override
    public void p() {
        p = 2 * pi * pi * r;
        System.out.println( " Периметр круга = " + p);
        }
    }

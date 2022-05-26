package Figury1;

    public class Pryamougolnik implements Connect {
        double s;
        double p;
        int a;
        int b;

        @Override
        public void s() {
            s = a * b;
            System.out.println(" Площадь прямоугольника = " + s);
        }

        @Override
        public void p() {
            p = a + a + b + b;
            System.out.println(" Периметр прямоугольника = " + p);
        }
    }

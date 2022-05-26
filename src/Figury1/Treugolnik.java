package Figury1;

    public class Treugolnik implements Connect {
        double p;
        int a;
        int b;
        int с;

        @Override
        public void s() {
            if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
            }
            double s;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Площадь треугольника " + s);
            }

        @Override
        public void p() {
            p = a + b + c;
            System.out.println("Периметр треугольника = " + p);
        }
}

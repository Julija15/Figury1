package Figury;

    public class Pryamougolnik extends Figury {
        int a;
        int b;

        @Override
        public void squery() {
            int s1 = a * b;
            System.out.println( "s = "  +  s1);
        }
        @Override
        public double perimetr() {
        int p2 = a + a + b + b;
            System.out.println(" p = " + p2);
            return p2;
        }

        public Pryamougolnik(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

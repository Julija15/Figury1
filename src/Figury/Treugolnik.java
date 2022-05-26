package Figury;

    public class Treugolnik extends Figury {

        int a;
        int b;
        int c;
        int p6;

        @Override
        public void squery() {
            double s3 = Math.sqrt(p6 * (p6 - a) * (p6 - b) * (p6 - c));
            System.out.println ( "s = " + s3);
        }

        @Override
        public double perimetr() {
            int k = a+b+c;
            System.out.println( "p = " + k);
            return k;
        }

        public Treugolnik(int a, int b, int c) {

            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

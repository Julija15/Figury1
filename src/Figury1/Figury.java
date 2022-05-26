package Figury1;

public abstract class Figury {
    protected String name = "";
    protected double pi = 3.1415;
    double r;
    int a;
    int b;
    int c;
    Figury[] figuries = new Figury[10];
     public abstract void setFiguries();
    public abstract void setName();

    public abstract double getS();

    public abstract double getP();

    public double Treugolnik() {
        this.name = "treugolnik";
        this.a = a;
        this.b = b;
        this.c = c;
        return 0;
    }

    public void Krug () {
        name = "krug";
        this.r = r;
        this.pi = pi;
    }

    public void Pryamougolnik () {
        name = "pryamougolnik";
        this.a = a;
        this.b = b;
    }
}





package Java9.ManoFigura;

public class Staciakampis extends Figura {

    private double x;
    private double y;

    public Staciakampis(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimetras() {
        return (x + y) * 2;
    }

    @Override
    public double plotas() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Staciakampio perimetras = " + perimetras() + " Staciakampio plotas = " + plotas();
    }

    public double ilgiausiaKrastine() {
        if(x > y){
            return x;
        }else {return y;}

    }
}
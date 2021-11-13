package Java9.ManoFigura;

public class Kvadratas extends Figura{
    private double x;

    public Kvadratas(double x){
        this.x = x;
    }

    @Override
    public double perimetras() {
        return x * 4;
    }

    @Override
    public double plotas() {
        return x * x;
    }
    public String toString(){
        return "Kvadrato perimetras = " + perimetras() + " Kvadrato plotas = " + plotas();
    }
    public double ilgiausiaKrastine(){
        return x;
    }
}

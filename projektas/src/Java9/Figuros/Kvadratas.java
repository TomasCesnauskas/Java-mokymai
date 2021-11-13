package Java9.Figuros;

public class Kvadratas extends Figura {
    private double x;

    public Kvadratas(double x){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    @Override
    public double perimetras(){
        return 4 * x;
    }
    @Override
    public double plotas(){
       return Math.pow(x , 2);
    }

    @Override
    public String toString() {
        return "Kvadrato perimetras = " + perimetras() + " Potas = " + plotas();
    }
    @Override

    public  double ilgiausiaKrastine(){
        return x;
    }
}

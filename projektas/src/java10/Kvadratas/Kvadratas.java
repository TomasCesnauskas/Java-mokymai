package java10.Kvadratas;

public class Kvadratas implements Area,Perimeter{

    private double krastine;

    public Kvadratas(double krastine){
        this.krastine = krastine;
    }

    @Override
    public double area() {
        return krastine * krastine;
    }

    @Override
    public double perimetras() {
        return krastine * 4;
    }

    public double getKrastine() {
        return krastine;
    }

    public void setKrastine(double krastine) {
        this.krastine = krastine;
    }
}

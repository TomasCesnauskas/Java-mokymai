package Java8.Figuros;

public class StatusisTrikampis extends Figura{
    private double x;
    private double y;
    private double z;

    public StatusisTrikampis(double x, double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double perimetras(){
        return x + y + z;
    }
    @Override
    public double plotas(){
        return x * y/2;
    }
    @Override
    public String toString(){
        return "Staciojo trikampio perimetras = " + perimetras() + " Plotas = " + plotas();
    }    @Override

    public double ilgiausiaKrastine() {
        if(x > y && x > z){
            return x;
        }
        else  if(y > z){
            return y;
        }
        else{
            return z;
        }
    }
}

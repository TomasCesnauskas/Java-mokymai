package Java9.Figuros;

public class LygiakrastisTrikampis extends Figura {

    private double x;

    public LygiakrastisTrikampis(double x){
        this.x = x;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public  String toString(){
        return "Lygiakrastis trikampio perimetras = " + perimetras() + " Plotas = " + plotas();
    }

    public double perimetras(){
    return x * 3;

    }
    public double plotas(){
    return x * Math.sqrt(3)/4;
    }

    public double ilgiausiaKrastine(){

            return x;
        }
    }



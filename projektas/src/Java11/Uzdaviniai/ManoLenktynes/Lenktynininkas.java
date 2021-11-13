package Java11.Uzdaviniai.ManoLenktynes;

public class Lenktynininkas {

    private String numeris;
    private int ratai;
    private double[] degaluKiekiai;

    public Lenktynininkas(String numeris, int ratai, double[] degaluKiekiai){
        this.numeris = numeris;
        this.degaluKiekiai = degaluKiekiai;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public double[] getDegaluKiekiai() {
        return degaluKiekiai;
    }

    public void setDegaluKiekiai(double[] degaluKiekiai) {
        this.degaluKiekiai = degaluKiekiai;
    }

}

package Java11.Uzdaviniai.Lenktynes;

public class Lenktynininkas {

    private String numeris;
    private double[] degaluSunaudojimas;


    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public double[] getDegaluSunaudojimas() {
        return degaluSunaudojimas;
    }

    public void setDegaluSunaudojimas(double[] degaluSunaudojimas) {
        this.degaluSunaudojimas = degaluSunaudojimas;
    }

    public Lenktynininkas(String numeris, double[] degaluSunaudojimas) {
        this.numeris = numeris;
        this.degaluSunaudojimas = degaluSunaudojimas;

    }

    public double degaluVidurkis() {
        double suma = 0;
        for(int i = 0; i < degaluSunaudojimas.length; i++){
            suma += degaluSunaudojimas[i];
        }
        return suma/degaluSunaudojimas.length;
    }
}

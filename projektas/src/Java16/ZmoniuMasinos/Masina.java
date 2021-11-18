package Java16.ZmoniuMasinos;

public class Masina {
    private String marke;
    private String numeriai;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getNumeriai() {
        return numeriai;
    }

    public void setNumeriai(String numeriai) {
        this.numeriai = numeriai;
    }

    public Masina(String marke, String numeriai){
        this.marke = marke;
        this.numeriai = numeriai;
    }

    @Override
    public String toString() {
        return
                "marke='" + marke + '\'' +
                ", numeriai='" + numeriai + '\'' +
                '}';
    }
}

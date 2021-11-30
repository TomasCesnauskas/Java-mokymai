package Uzdaviniai.PrekybaElektronikosPrekemis;

public class Prietaisas {

    private Integer numeris;
    private String pavadinimas;
    private Double kaina;
    private Integer parduota;

    public Prietaisas(){}


    public Prietaisas(Integer numeris, String pavadinimas, Double kaina, Integer parduota){
        this.numeris = numeris;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.parduota = parduota;
    }
    public Prietaisas(Integer numeris, String pavadinimas, Double kaina){
        this.numeris = numeris;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }
    public Integer getNumeris() {
        return numeris;
    }

    public void setNumeris(Integer numeris) {
        this.numeris = numeris;
    }

    @Override
    public String toString() {
        return  numeris + " "+ pavadinimas + " " +  kaina + " " +  parduota;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    public Integer getParduota() {
        return parduota;
    }

    public void setParduota(Integer parduota) {
        this.parduota = parduota;
    }
}

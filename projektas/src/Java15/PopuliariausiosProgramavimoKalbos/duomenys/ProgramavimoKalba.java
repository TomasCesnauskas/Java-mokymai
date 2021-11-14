package Java15.PopuliariausiosProgramavimoKalbos.duomenys;

public class ProgramavimoKalba {

private String pavadinimas;
private Integer vieta2014;
    private Integer vieta2013;
    private Double reitingas;
    private Double pokytis;


    public ProgramavimoKalba(String pavadinimas,Integer vieta2014,Integer vieta2013, Double reitingas, Double pokytis){

        this.pavadinimas = pavadinimas;
        this.vieta2013 = vieta2013;
        this.vieta2014 = vieta2014;
        this.reitingas = reitingas;
        this.pokytis = pokytis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getVieta2014() {
        return vieta2014;
    }

    public void setVieta2014(Integer vieta2014) {
        this.vieta2014 = vieta2014;
    }

    public Integer getVieta2013() {
        return vieta2013;
    }

    public void setVieta2013(Integer vieta2013) {
        this.vieta2013 = vieta2013;
    }

    public Double getReitingas() {
        return reitingas;
    }

    public void setReitingas(double reitingas) {
        this.reitingas = reitingas;
    }

    public Double getPokytis() {
        return pokytis;
    }

    public void setPokytis(double pokytis) {
        this.pokytis = pokytis;
    }

   public String toString(){
        return pavadinimas + " " + vieta2014 + " " + vieta2013 + " " + reitingas + " " + pokytis;
   }


}

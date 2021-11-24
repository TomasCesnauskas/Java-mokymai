package Uzdaviniai.Saldainiai;

public class Saldainis implements Comparable<Saldainis> {

    private String saldainioPavadinimas;
    private Integer vertinimas;

    public Saldainis(String saldainioPavadinimas, Integer vertinimas){

        this.saldainioPavadinimas = saldainioPavadinimas;
        this.vertinimas = vertinimas;
    }

    public String getSaldainioPavadinimas() {
        return saldainioPavadinimas;
    }

    public void setSaldainioPavadinimas(String saldainioPavadinimas) {
        this.saldainioPavadinimas = saldainioPavadinimas;
    }

    public Integer getIvertinimas() {
        return vertinimas;
    }

    public void setIvertinimas(Integer ivertinimas) {
        this.vertinimas = ivertinimas;
    }

    @Override
    public String toString() {
        return saldainioPavadinimas + " " + vertinimas;
    }

    @Override
    public int compareTo(Saldainis o) {
        if(o == null){
            return 1;
        }
        int result = vertinimas.compareTo(o.getIvertinimas());
        if(result !=0){
            return result;

        }

        return saldainioPavadinimas.compareTo(o.getSaldainioPavadinimas());
    }
}

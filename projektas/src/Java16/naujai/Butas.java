package Java16.naujai;

public class Butas implements Comparable<Butas> {
    private String butoNr;
    private String adresas;
    private Integer kambariuSk;
    private Double kvadratura;
    private Double nuomosKaina;

    public Butas(String butoNr, String adresas, Integer kambariuSk, Double kvadratura, Double nuomosKaina) {
        this.butoNr = butoNr;
        this.adresas = adresas;
        this.kambariuSk = kambariuSk;
        this.kvadratura = kvadratura;
        this.nuomosKaina = nuomosKaina;
    }

    @Override
    public String toString() {
        return String.format("%-2s", butoNr) + " " + String.format("%-25s", adresas) + " " + kambariuSk + " " + kvadratura + " " + nuomosKaina;
    }

    public String getButoNr() {
        return butoNr;
    }

    public void setButoNr(String butoNr) {
        this.butoNr = butoNr;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public Integer getKambariuSk() {
        return kambariuSk;
    }

    public void setKambariuSk(Integer kambariuSk) {
        this.kambariuSk = kambariuSk;
    }

    public Double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(Double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Double getNuomosKaina() {
        return nuomosKaina;
    }

    public void setNuomosKaina(Double nuomosKaina) {
        this.nuomosKaina = nuomosKaina;
    }

    @Override
    public int compareTo(Butas o) {
        if (o == null) {

            return 1;
        }

        //  return Double result = kvadratura.compareTo()

        if (kvadratura > o.getKvadratura()) {


            return 1;
        } else if (kvadratura < o.getKvadratura()) {


            return -1;
        }
        return 0;
    }
}
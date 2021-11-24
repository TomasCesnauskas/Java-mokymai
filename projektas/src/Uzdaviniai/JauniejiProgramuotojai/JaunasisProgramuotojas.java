package Uzdaviniai.JauniejiProgramuotojai;

public class JaunasisProgramuotojas implements Comparable<JaunasisProgramuotojas> {

    private String vardas;
    private String pavarde;
    private Integer balas;

    public JaunasisProgramuotojas(String vardas, String pavarde, Integer balas){

        this.vardas=vardas;
        this.pavarde = pavarde;
        this.balas = balas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Integer getBalas() {
        return balas;
    }

    public void setBalas(Integer balas) {
        this.balas = balas;
    }

    @Override
    public String toString() {
        return vardas +  " " + pavarde + " " + balas+ " ";
    }

    @Override
    public int compareTo(JaunasisProgramuotojas o) {

        if(o == null){
            return 1;

        }

        return balas.compareTo(o.getBalas());
    }
}

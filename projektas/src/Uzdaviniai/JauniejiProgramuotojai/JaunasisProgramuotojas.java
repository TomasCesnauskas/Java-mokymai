package Uzdaviniai.JauniejiProgramuotojai;

public class JaunasisProgramuotojas {

    private String vardas;
    private String pavarde;
    private int balas;

    public JaunasisProgramuotojas(String vardas, String pavarde, int balas){

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

    public int getBalas() {
        return balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    @Override
    public String toString() {
        return vardas +  " " + pavarde + " " + balas+ " ";
    }
}

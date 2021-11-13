package Java9.ManoZmogus;

public class Studentas extends ManoZmogus{

    private int kursas;
    private String kryptis;

    public Studentas(String vardas, String pavarde, int amzius, int kursas, String kryptis){
        super(vardas, pavarde, amzius);
        this.kursas = kursas;
        this.kryptis = kryptis;
    }

    public int getKursas() {
        return kursas;
    }

    public void setKursas(int kursas) {
        this.kursas = kursas;
    }

    public String getKryptis() {
        return kryptis;
    }

    public void setKryptis(String kryptis) {
        this.kryptis = kryptis;
    }

    @Override
    public String gautiZmogausInformacija() {
        return getVardas() + " " + getPavarde() + " " + getAmzius() + " " + getKursas() + " " + getKryptis();
    }
}

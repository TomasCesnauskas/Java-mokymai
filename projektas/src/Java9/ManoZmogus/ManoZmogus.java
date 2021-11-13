package Java9.ManoZmogus;

public abstract class ManoZmogus {

    private String vardas;
    private String pavarde;
    private int amzius;

    public ManoZmogus(String vardas, String pavarde, int amzius) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
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
    public int getAmzius(){
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }
public abstract String gautiZmogausInformacija();

}



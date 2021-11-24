package Uzdaviniai.Saldainiai;

import java.util.List;

public class Gamintojas {

    String gamintojoPavadinimas;
    List<Saldainis> saldainiai;


public Gamintojas(String gamintojoPavadinimas, List<Saldainis> saldainiai){

    this.gamintojoPavadinimas = gamintojoPavadinimas;
    this.saldainiai = saldainiai;
}

    public String getGamintojoPavadinimas() {
        return gamintojoPavadinimas;
    }

    public void setGamintojoPavadinimas(String gamintojoPavadinimas) {
        this.gamintojoPavadinimas = gamintojoPavadinimas;
    }

    public List<Saldainis> getSaldainiai() {
        return saldainiai;
    }

    public void setSaldainiai(List<Saldainis> saldainiai) {
        this.saldainiai = saldainiai;
    }

    @Override
    public String toString() {
        return  gamintojoPavadinimas + getSaldainiai();
    }
}
package Java9.ManoZmogus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Zmones {

    private ManoZmogus[] sarasas;

    //konstruktorius
    public Zmones(ManoZmogus[] sarasas) {
        this.sarasas = sarasas;
    }

    //tuscias konstruktorius
    public Zmones() {
        this.sarasas = new ManoZmogus[0];
    }

    public ManoZmogus[] getSarasas() {
        return sarasas;
    }

    public void setSarasas(ManoZmogus[] sarasas) {
        this.sarasas = sarasas;
    }

    public void spausdintiMasyva() {
        for (int i = 0; i < sarasas.length; i++) {
            System.out.println(sarasas[i].gautiZmogausInformacija());
        }
    }

    //nuskaityti faila
    public void nuskaitytiFaila(String path) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                String[] perskirtosReiksmes = line.split(" ");
                if (perskirtosReiksmes[0].equals("S")) {
                    int amzius = Integer.parseInt(perskirtosReiksmes[3]);
                    int kursas = Integer.parseInt(perskirtosReiksmes[4]);
                    Studentas studentas = new Studentas(perskirtosReiksmes[1], perskirtosReiksmes[2], amzius, kursas, perskirtosReiksmes[5]);
                    sarasas = pridetiElementa(sarasas, studentas);
                } else if (perskirtosReiksmes[0].equals("D")) {
                    int amzius = Integer.parseInt(perskirtosReiksmes[3]);
                    int stazas = Integer.parseInt(perskirtosReiksmes[4]);
                    Darbuotojas darbuotojas = new Darbuotojas(perskirtosReiksmes[1],perskirtosReiksmes[2], amzius, stazas, perskirtosReiksmes[5]);
                    sarasas = pridetiElementa(sarasas,darbuotojas);
                }
                line = br.readLine();
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static ManoZmogus[] pridetiElementa(ManoZmogus[] masyvas, ManoZmogus reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
    public ManoZmogus vyriausiasZmogus(){
        ManoZmogus vyriausias = sarasas[0];
        for(int i = 1; i < sarasas.length; i++){
            if(vyriausias.getAmzius() < sarasas[i].getAmzius()){
                vyriausias = sarasas[i];
            }
        }return vyriausias;
    }

}





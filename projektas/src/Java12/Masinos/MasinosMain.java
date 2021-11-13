package Java12.Masinos;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MasinosMain {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Java12/Masinos/duomenys.txt";
        String rezultatai = "projektas/src/Java12/Masinos/rezultatai.txt";


        Car[] masinos = skaitytiFaila(failoKelias);
        System.out.println(masinos.length);

        rasyti(rezultatai, masinos);


    }


    static Car[] skaitytiFaila(String kelias) {

        BufferedReader br;
        Car[] masinos = new Car[0];


        try {
            br = new BufferedReader(new FileReader(kelias));
            String line = br.readLine();

            int masinuKiekis = Integer.parseInt(line);
            masinos = new Car[masinuKiekis];

            for (int i = 0; i < masinuKiekis; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");

                String gamintojas = reiksmes[0];
                String modelis = reiksmes[1];
                int metai = Integer.parseInt(reiksmes[2]);
                double kaina = Double.parseDouble(reiksmes[3]);
                double variklioTuris = Double.parseDouble(reiksmes[4]);
                Kuras kuras = resolveKuras(reiksmes[5]);

                Car masina = new Car(gamintojas, modelis, metai, kaina, variklioTuris, kuras);

                masinos[i] = masina;

            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return masinos;

    }

    static public Kuras resolveKuras(String kuras) {
        switch (kuras) {
            case "B":
                return Kuras.BENZINAS;
            case "D":
                return Kuras.DYZELINAS;
            case "BD":
                return Kuras.BENZINAS_DUJOS;
            case "E":
                return Kuras.ELEKTRA;
            default:
                return Kuras.NEZINOMAS;
        }
    }

    static public Car seniausiaMasina(Car[] y) {

        if (y.length == 0) {
            return null;
        }
        Car seniausiaMasina = y[0];
        for (int i = 0; i < y.length; i++) {

            if (seniausiaMasina.getMetai() > y[i].getMetai()) {
                seniausiaMasina = y[i];

            }

        }
        return seniausiaMasina;

    }

    static void rasyti(String failoKelias, Car[] a) {
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(failoKelias));
            bw.write("Masinos:");
            for (int i = 0; i < a.length; i++) {

                bw.write(a[i].toString());
                bw.newLine();
            }

            Car seniausia = seniausiaMasina(a);
            bw.write("Seniausia masina:");
            bw.newLine();
            bw.write(seniausia.toString());
            bw.newLine();
            bw.write("Naujesnes nei 2008:");
            bw.newLine();

            Car[] naujos = naujesnesNei2008(a, 2008);
            for (int i = 0; i < naujos.length; i++) {
                bw.write(naujos[i].toString());
                bw.newLine();

            }
            bw.write("VW gamintojo masinos:");
            bw.newLine();
            Car[] vwMasinos = gamintojoFiltras(a, "VW");
            for (int i = 0; i < vwMasinos.length; i++) {
                bw.write(vwMasinos[i].toString());
                bw.newLine();
            }
            bw.newLine();
            bw.write("Didziausia variklio turi turinti masina:");
            Car didelisTuris = didziausiasVariklioTuris(a);
            bw.write(didelisTuris.toString());
            bw.newLine();
       int benzininiuKiekis = filtruotiPagalKura(a,Kuras.BENZINAS);
       bw.write("Benzininiu automobiliu kiekis: " + benzininiuKiekis);



            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Car[] naujesnesNei2008(Car[] y, int metai) {
        Car[] naujosMasinos = new Car[0];
        for (int i = 0; i < y.length; i++)
            if (y[i].getMetai() > metai) {
                naujosMasinos = Arrays.copyOf(naujosMasinos, naujosMasinos.length + 1);
                naujosMasinos[naujosMasinos.length - 1] = y[i];

            }
        return naujosMasinos;
    }

    static Car[] gamintojoFiltras(Car[] k, String ieskomasGamintojas) {

        Car[] filtruotos = new Car[0];
        for (int i = 0; i < k.length; i++) {
            String gamintojas = k[i].getGamintojas();
            if (gamintojas.equals(ieskomasGamintojas)) {
                filtruotos = Arrays.copyOf(filtruotos, filtruotos.length + 1);
                filtruotos[filtruotos.length - 1] = k[i];
            }


        }
        return filtruotos;
    }

    static Car didziausiasVariklioTuris(Car[] e) {
        if (e.length == 0) {
            return null;
        }

        Car didziausiasVariklioTuris = e[0];
        for (int i = 0; i < e.length; i++) {
            if (didziausiasVariklioTuris.getVariklioTuris() < e[i].getVariklioTuris()) {
                didziausiasVariklioTuris = e[i];
            }

        }
        return didziausiasVariklioTuris;
    }
    static int filtruotiPagalKura(Car[] q, Kuras ieskomasKuras ){
        int kiekis = 0;

        for(int i = 0; i < q.length; i++){
            if(q[i].getKuroTipas().equals(ieskomasKuras)){
                kiekis++;
            }
        }
        return kiekis;
    }
}

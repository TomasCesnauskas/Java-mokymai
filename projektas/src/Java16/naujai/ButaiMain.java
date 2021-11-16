package Java16.naujai;

import java.io.*;
import java.util.*;

public class ButaiMain {
    public static void main(String[] args) {

        String duomenys = "projektas/src/Java16/naujai/Duomenys.txt";
        String kriterijai = "projektas/src/Java16/naujai/Kriterijai.txt";
        List<Butas> butai = new ArrayList<>();

        skaitytiButus(duomenys, butai);
        Kriterijus kriterijus = skaitytiKriterijus(kriterijai);
        //System.out.println(kriterijus.getIkiKaina());
        List<Butas> atfiltruotiButai = atfiltruotiButus(butai, kriterijus);
        Collections.sort(atfiltruotiButai);
        Collections.reverse(atfiltruotiButai);


        //   System.out.println(atfiltruotiButai);
        for (Butas b : atfiltruotiButai) {
            System.out.println(b);
        }
    }

    static void skaitytiButus(String failoKelias, List<Butas> x) {
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));

            String line = br.readLine();
            int n = Integer.parseInt(line);


            for (int i = 0; i < n; i++) {

                line = br.readLine();
                String[] reiksmes = line.split(" ");

                String butoNr = reiksmes[0];
                String adresas = reiksmes[1] + " " + reiksmes[2] + " " + reiksmes[3];
                int kambariuSk = Integer.parseInt(reiksmes[4]);
                double kvadratura = Double.parseDouble(reiksmes[5]);
                Double kaina = Double.parseDouble(reiksmes[6]);

                Butas b = new Butas(butoNr, adresas, kambariuSk, kvadratura, kaina);
                x.add(b);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Kriterijus skaitytiKriterijus(String failoKelias) {

        BufferedReader br;
        Kriterijus kriterijus = null;

        try {
            br = new BufferedReader(new FileReader(failoKelias));

            //Pirmas
            String line = br.readLine();
            String[] reiksmes = line.split(" ");

            int nuoKambSk = Integer.parseInt(reiksmes[0]);
            int ikiKambSk = Integer.parseInt(reiksmes[1]);

            //Antras
            line = br.readLine();
            reiksmes = line.split(" ");

            Double nuoPlotas = Double.parseDouble(reiksmes[0]);
            Double ikiPlotas = Double.parseDouble(reiksmes[1]);

            //Trecias
            line = br.readLine();
            reiksmes = line.split(" ");

            Double nuoKaina = Double.parseDouble(reiksmes[0]);
            Double ikiKaina = Double.parseDouble(reiksmes[1]);

            kriterijus = new Kriterijus(nuoKambSk, ikiKambSk, nuoPlotas, ikiPlotas, nuoKaina, ikiKaina);

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return kriterijus;
    }

    static List<Butas> atfiltruotiButus(List<Butas> y, Kriterijus k) {

        List<Butas> filtruotiButai = new ArrayList<>();

        for (int i = 0; i < y.size(); i++) {

            if (y.get(i).getKambariuSk() <= k.getIkiKambariuSk() && y.get(i).getKambariuSk() >= k.getNuoKambariuSk()
                    && y.get(i).getKvadratura() <= k.getIkiPlotas() && y.get(i).getKvadratura() >= k.getNuoPlotas() &&
                    y.get(i).getNuomosKaina() <= k.getIkiKaina() && y.get(i).getNuomosKaina() >= k.getNuoKaina()) {
                filtruotiButai.add(y.get(i));
            }
        }
        return filtruotiButai;
    }
    static void spausdinti(List<Butas> x,String failoKelias){
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(failoKelias));

            for(int i= 0; i < x.size(); i++){


            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

package Uzdaviniai.Saldainiai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Uzdaviniai/Saldainiai/duomenys.txt";

        List<Gamintojas> gamintojai = new ArrayList<>();

        skaityt(failoKelias,gamintojai);


        for(int i = 0; i < gamintojai.size(); i++){

            Collections.sort(gamintojai.get(i).getSaldainiai());
        }


   for(Gamintojas x : gamintojai){

        System.out.println(x.getGamintojoPavadinimas());

        for(Saldainis s : x.getSaldainiai()){

            System.out.println(s);
        }
    }
    }

    static void skaityt(String failokelias, List<Gamintojas> a) {

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failokelias));
            String line = br.readLine();
            String[] reiksmes = line.split(" ");
            Integer rusiuKiekis = Integer.parseInt(reiksmes[0]);

            for (int i = 0; i < rusiuKiekis; i++) {
                line = br.readLine();
                reiksmes = line.split(" ");

                String gamintojoPavadinimas = gautiPavadinima(reiksmes);
                Integer saldainiuKiekis = Integer.parseInt(reiksmes[reiksmes.length - 1]);
                List<Saldainis> saldainiai = new ArrayList<>();
                for (int j = 0; j < saldainiuKiekis; j++) {

                    line = br.readLine();
                    reiksmes = line.split(" ");

                    String saldainiuPavadinimas = gautiPavadinima(reiksmes);
                    Integer ivertinimas = Integer.parseInt(reiksmes[reiksmes.length - 1]);
                    Saldainis s = new Saldainis(saldainiuPavadinimas, ivertinimas);
                    saldainiai.add(s);
                }
                Gamintojas g = new Gamintojas(gamintojoPavadinimas, saldainiai);
                a.add(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String gautiPavadinima(String[] reiksmes) {
        String pavadinimas = "";

        for (int i = 0; i < reiksmes.length - 1; i++) {
            if(i == 0){

                pavadinimas = pavadinimas + reiksmes[i];
            }else{

            pavadinimas = pavadinimas + " " + reiksmes[i];
            }
        }
        return pavadinimas;
    }
}

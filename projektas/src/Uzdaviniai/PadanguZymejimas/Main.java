package Uzdaviniai.PadanguZymejimas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Uzdaviniai/PadanguZymejimas/duomenys.txt";
        List<Padanga> padangos = new ArrayList<>();

        Padanga ieskoma = skaityti(failoKelias, padangos);

        System.out.println(ieskoma.getSkersmuo());
        List<Padanga> atrinktosPadangos = gautiTinkamasPadangas(padangos, ieskoma);

        System.out.println("Tinkamu padangu skaicius: " + atrinktosPadangos.size());
        System.out.println("Jos kainuotu: " + gautiSuma(atrinktosPadangos));
    }
    static Padanga skaityti(String failoKelias, List<Padanga> p) {

        BufferedReader br;
        Padanga ieskomaPadanga = null;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();

            ieskomaPadanga = sukurtiPadanga(line);

            line = br.readLine();

            int padanguSkaicius = Integer.parseInt(line);

            for (int i = 0; i < padanguSkaicius; i++) {
                line = br.readLine();
                Padanga padanga = sukurtiPadanga(line);
                p.add(padanga);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ieskomaPadanga;
    }

    static Padanga sukurtiPadanga(String line) {


        String[] values = line.split(" ");

        String plotis = values[0];
        String aukstis = values[1];
        String skersmuo = values[2];

        if (values.length == 3) {
            Padanga padanga = new Padanga(plotis, aukstis, skersmuo);
            return padanga;
        }

        Double kaina = Double.parseDouble(values[3]);
        return new Padanga(plotis, aukstis, skersmuo, kaina);
    }
    static List<Padanga> gautiTinkamasPadangas(List<Padanga> padangos, Padanga ieskomaPadanga){

        List<Padanga> ieskomosPadangos = new ArrayList<>();
        for(int i = 0 ; i < padangos.size(); i++){

            Padanga p = padangos.get(i);
//            if(ieskomaPadanga.getPlotis()equals(p.getPlotis())){
//                ieskomosPadangos.add(padangos.get(i));
//            }

            if(ieskomaPadanga.equals(p)){
                ieskomosPadangos.add(p);
            }
        }
return ieskomosPadangos;

    }
    static  Double gautiSuma(List<Padanga> padangos){

        Double suma = 0d;
        for(int i = 0; i < padangos.size(); i++){

            suma = suma + padangos.get(i).getKaina();

        }
        return suma;
    }

}

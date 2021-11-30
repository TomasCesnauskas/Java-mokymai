package Uzdaviniai.OroTemperaturosMatavimai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String duomenys = "projektas/src/Uzdaviniai/OroTemperaturosMatavimai/duomenys.txt";
        List<MatavimuMenuo> matavimuMenuo = new ArrayList<>();

        skaityti(duomenys,matavimuMenuo);
        System.out.println(matavimuMenuo.size());

        Double bendraVidurkiuSuma = 0.0;
        for(int i = 0; i < matavimuMenuo.size(); i++){


            System.out.println(matavimuMenuo.get(i).getMenuo() + " " + String.format("%.2f",vidurkis(matavimuMenuo.get(i).getTemperaturos()))) ;

        }
        System.out.println("Bendras matavimu vidurkis: ");


    }


    static void skaityti(String kelias, List<MatavimuMenuo> x) {

        BufferedReader br;

        try {

            br = new BufferedReader(new FileReader(kelias));
            String line = br.readLine();
            String[] reiksmes = line.split(" ");

            Integer menesiuSkaicius = Integer.parseInt(reiksmes[0]);
            Integer matavimuSkaicius = Integer.parseInt(reiksmes[1]);

            String menuo = "";

            for (int i = 0; i < menesiuSkaicius; i++) {

                line = br.readLine();
                reiksmes = line.split(" ");

                menuo = reiksmes[0];
                List<Double> matavimai = new ArrayList<>();
                for (int j = 1; j <= matavimuSkaicius; j++) {

                    Double matavimas = Double.parseDouble(reiksmes[j]);

                    matavimai.add(matavimas);

                }
                MatavimuMenuo matavimuMenuo = new MatavimuMenuo(menuo, matavimai);
                x.add(matavimuMenuo);
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static Double vidurkis(List<Double> x){

        Double suma = 0d;
        Double vidurkis = 0d;
        for( Double y : x){
            suma = suma + y;

        }
        vidurkis = suma/x.size();


return vidurkis;
    }
}

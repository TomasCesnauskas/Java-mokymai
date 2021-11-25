package Uzdaviniai.Bendrabutis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Bendrabutis {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Uzdaviniai/Bendrabutis/duomenys.txt";

        List<Double> sarasas = new ArrayList<>();

        Double kwKaina = skaityti(failoKelias, sarasas);
        System.out.println(kwKaina);

        List<Double>saskaituSarasas = saskaitos(sarasas,kwKaina);

        for(int i = 0; i < saskaituSarasas.size();i++){

            System.out.println(i+1 + ". " + String.format("%.2f", saskaituSarasas.get(i))   + " LT");

        }

        Double suma = bendraSaskaita(saskaituSarasas);
        System.out.println(suma);


        Double vienoKambarioMokes = vidurkis(suma,saskaituSarasas.size());
        System.out.println(vienoKambarioMokes);

    }

    static Double skaityti(String failoKelias, List<Double> x) {

        BufferedReader br;

        Double kaina = 0d;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();

            int kambariai = Integer.parseInt(line);


            line = br.readLine();
            kaina = Double.parseDouble(line);

            for (int i = 0; i < kambariai; i++) {

                line = br.readLine();
                Double sunaudota = Double.parseDouble(line);

                x.add(sunaudota);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kaina;
    }

    static List<Double> saskaitos(List<Double> y, Double kaina) {

        List<Double> saskaitos = new ArrayList<>();

        for (int i = 0; i < y.size();i++) {

            double saskaita = y.get(i) * kaina;
            saskaitos.add(saskaita);
        }
        return saskaitos;
    }

    static double bendraSaskaita(List<Double> saskaitos){
        int suma= 0;
for( Double n  :saskaitos) {

    suma += n;

}return suma;
    }
    static Double vidurkis(Double bendraSaskaita, Integer kambariai){

        return bendraSaskaita/kambariai;
    }
}

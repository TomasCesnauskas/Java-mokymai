package Uzdaviniai.AvalynesParduotuve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String duomenys = "projektas/src/Uzdaviniai/AvalynesParduotuve/duomenys.txt";
        List<Avalyne> avalynesSarasas = new ArrayList<>();
        readFile(duomenys, avalynesSarasas);

        System.out.println(avalynesSarasas.size());

        List<Avalyne> moteriski = filtruotiPagalLyti(avalynesSarasas, Lytis.Moteris);
        List<Avalyne> vyriski = filtruotiPagalLyti(avalynesSarasas, Lytis.VYRAS);

//        System.out.println(moteriski.size());
//        System.out.println(vyriski.size());

        Double motsuma = suma(moteriski);
        Double motvidurkis = vidurkis(motsuma, moteriski.size());

        System.out.println("Moteriska avalyne: ");
        System.out.println("Per diena parduota uz: " + String.format("%.2f",motsuma));
        System.out.println("Vidutiniskai viena pora kainavo: " + String.format("%.2f",motvidurkis));

        Double vyrsuma = suma(vyriski);
        Double vyrvidurkis = vidurkis(vyrsuma, vyriski.size());

        System.out.println("Vyriska avalyne: ");
        System.out.println("Per diena parduota uz: " + String.format("%.2f",vyrsuma));
        System.out.println("Vidutiniskai viena pora kainavo: " + String.format("%.2f", vyrvidurkis));


        System.out.println("Iš viso per dieną parduota avalynės už " + String.format("%.2f", suma(avalynesSarasas)) );


    }


    static void readFile(String failoKelias, List<Avalyne> x) {
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();

            int sarasoIlgis = Integer.parseInt(line);

            for (int i = 0; i < sarasoIlgis; i++) {
                line = br.readLine();
                String[] values = line.split(" ");

                Lytis lytis = gautiLyti(values[0]);
                Double kaina = Double.parseDouble(values[1]);

                Avalyne avalyne = new Avalyne(kaina, lytis);
                x.add(avalyne);


            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static Lytis gautiLyti(String x) {
        Lytis lytis = null;

        switch (x.toLowerCase()) {

            case "v":
                return Lytis.VYRAS;

            case "m":
                return Lytis.Moteris;

            default:
                return null;

        }


    }

    static List<Avalyne> filtruotiPagalLyti(List<Avalyne> batai, Lytis norimaLytis) {
        List<Avalyne> filtruotasSarasas = new ArrayList<>();

        for (Avalyne x : batai) {

            if (x.getLytiesRusis().equals(norimaLytis)) {

                filtruotasSarasas.add(x);
            }
        }

        return filtruotasSarasas;
    }

    static Double suma(List<Avalyne> x) {

        Double suma = 0d;
        for (Avalyne y : x) {

            suma += y.getKaina();
        }
        return suma;
    }

    static Double vidurkis(Double suma, Integer kiekis) {

        return suma / kiekis;
    }
}

package Uzdaviniai.PrekybaBuitineTechnika;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Uzdaviniai/PrekybaBuitineTechnika/Sandelys.txt";
        List<BuitineTechnika> buitineTechnika = new ArrayList<>();

        skaitytiFaila(failoKelias, buitineTechnika);

        System.out.println(buitineTechnika.size());
        System.out.println(buitineTechnika.get(1));


    }

    static void skaitytiFaila(String failoKelias, List<BuitineTechnika> buitineTechnika) {

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            Integer technikosKiekis = Integer.parseInt(line);

            for (int i = 0; i < technikosKiekis; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");
                String pavadinimas = gautiPavadinima(reiksmes);
                Integer kodas = Integer.parseInt(reiksmes[reiksmes.length - 3]);
                Integer kiekis = Integer.parseInt(reiksmes[reiksmes.length - 2]);
                Double kaina = Double.parseDouble(reiksmes[reiksmes.length - 1]);
                BuitineTechnika technika = new BuitineTechnika(pavadinimas, kodas, kiekis, kaina);
                buitineTechnika.add(technika);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String gautiPavadinima(String[] a) {
        String pavadinimas = "";
        for (int i = 0; i < a.length - 3; i++) {
            pavadinimas += " " + a[i];
        }
        return pavadinimas;
    }

    static List<BuitineTechnika> uzsakymai(List<BuitineTechnika> x, String failoKelias, String failoKelias2) {

        BufferedReader br;
        BufferedWriter bw;
        List<BuitineTechnika> uzsakymai = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            bw = new BufferedWriter(new FileWriter(failoKelias2));

            String line = br.readLine();

            Integer pardavimuSkaicius = Integer.parseInt(br.readLine());

            for(int i = 0; i < pardavimuSkaicius; i++){
                line = br.readLine();
                String[] values = line.split(" ");

                Integer kodas = Integer.parseInt(values[0]);
                Integer parduotaVienetu = Integer.parseInt(values[1]);

                for(int j = 0; j < x.size(); j++){
                    if(x.get(j).getKodas() == kodas ){
                      Integer laikinasKiekis = x.get(j).getKiekis();
                      laikinasKiekis = laikinasKiekis - parduotaVienetu;
                      if(laikinasKiekis < 0){
                          x.remove(j);

                      }else if(laikinasKiekis > 0){
                          x.get(j).setKiekis(laikinasKiekis);
                      }

                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
return uzsakymai;
    }
}

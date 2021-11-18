package Java16.ZmoniuMasinos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String zmoniuDuomenys = "projektas/src/Java16/ZmoniuMasinos/duomenys.txt";
        String masinuDuomenys = "projektas/src/Java16/ZmoniuMasinos/Masinos.txt";

        List<Zmogus> zmones = skaitytiZmones(zmoniuDuomenys);
        System.out.println(zmones);
        List<Masina> masinos = skaitytiMasinas(masinuDuomenys);


        System.out.println(masinos);

        Map<String, List<Masina>> m = apjungimas(zmones, masinos );

        for(int i = 0; i < m.size(); i++){

            System.out.println(m.get(i));
        }
    }

    static List<Zmogus> skaitytiZmones(String failoKelias) {

        BufferedReader br;
        List<Zmogus> zmones = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            while (line != null) {
                String[] values = line.split(" ");

                String asmensKodas = values[0];
                String vardas = values[1];
                String pavarde = values[2];
                String masinosNr = values[3];

                Zmogus zmogus = new Zmogus(asmensKodas, vardas, pavarde, masinosNr);
                zmones.add(zmogus);

                line = br.readLine();

            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return zmones;
    }

    static List<Masina> skaitytiMasinas(String failoKelias) {

        BufferedReader br;
        List<Masina> masinos = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            while (line != null) {
                String[] values = line.split(" ");

                String marke = values[0];
                String numeriai = values[1];

                Masina masina = new Masina(marke, numeriai);
                masinos.add(masina);
                line = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return masinos;
    }
    static Map<String, List<Masina>> apjungimas(List<Zmogus> x, List<Masina> y){
        Map<String, List<Masina>> mapas = new HashMap<>();
        for(int i = 0; i < x.size(); i++){
            Zmogus zmogus = x.get(i);
            Masina ieskomaMasina = gautiMasinaPagalNr(y,zmogus.getMasinosNr());

            if(ieskomaMasina == null){
                continue;
            }
            if(mapas.containsKey(zmogus.getAsmensKodas())){
                List<Masina> masinos = mapas.get(zmogus.getAsmensKodas());
                masinos.add(ieskomaMasina);


            }else{
                List<Masina> zmogausMasinos = new ArrayList<>();
                zmogausMasinos.add(ieskomaMasina);
                mapas.put(zmogus.getAsmensKodas(),zmogausMasinos);

            }


        }


        return mapas;
    }

    static Masina gautiMasinaPagalNr(List<Masina> masinos, String ieskomosMasinosNr){

        for(int i = 0; i < masinos.size(); i++){
            if(masinos.get(i).getNumeriai().equals(ieskomosMasinosNr)){

                return masinos.get(i);
            }

        }
        return null;

    }
}

package Uzdaviniai.PrekybaElektronikosPrekemis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String failoKelias = "projektas/src/Uzdaviniai/PrekybaElektronikosPrekemis/duomenys.text";
        List<Prietaisas>prietaisas = new ArrayList<>();

        readFile(failoKelias,prietaisas);
        Prietaisas populiariausias = populiariausias(prietaisas);


        System.out.println("Populiariausias: " + populiariausias.getPavadinimas());
        System.out.println("Parduota: " + populiariausias.getParduota());
        Double surinkta = populiariausias.getKaina() * populiariausias.getParduota();
        System.out.println("Surinkta: " + surinkta + "LT" );
    }
    static void readFile(String filePath, List<Prietaisas> x){
        BufferedReader br;


        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            int prietaisuKiekis = Integer.parseInt(line);

            for(int i = 0; i < prietaisuKiekis; i++){

                line = br.readLine();
                String[] reiksmes = line.split(" ");

                Integer numeris =Integer.parseInt(reiksmes[0]) ;
                Double kaina = Double.parseDouble(reiksmes[reiksmes.length-1]);
                String pavadinimas = "";
                        for(int j = 1; j < reiksmes.length-1;j++){
                            pavadinimas = pavadinimas + " " + reiksmes[j];
                        }

                        Prietaisas prietaisas = new Prietaisas(numeris,pavadinimas,kaina);
                        x.add(prietaisas);
            }

            line = br.readLine();
            Integer pardavimuSkaicius = Integer.parseInt(line);

            for(int i = 0; i < pardavimuSkaicius;i++){
                line = br.readLine();
                String[] reiksmes = line.split(" ");

                Integer numerisp = Integer.parseInt(reiksmes[0]);
                Integer parduota = Integer.parseInt(reiksmes[1]);

                for(int j = 0; j < x.size();j++){
                    if(numerisp == x.get(j).getNumeris()) {
                        if(x.get(j).getParduota() == null){
                            x.get(j).setParduota(0);
                        }
                        Integer visoParduota = x.get(j).getParduota() + parduota;
                        x.get(j).setParduota(visoParduota);
                    }

                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    static Prietaisas populiariausias(List<Prietaisas> x){
        Prietaisas populiariausias = x.get(0);

        for(int i = 1; i < x.size();i++){
           if(populiariausias.getParduota() < x.get(i).getParduota() ){

               populiariausias = x.get(i);
           }
        }
return populiariausias;
    }

}

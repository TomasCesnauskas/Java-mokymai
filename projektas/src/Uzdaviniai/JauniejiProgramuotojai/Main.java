package Uzdaviniai.JauniejiProgramuotojai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String failoKelias ="projektas/src/Uzdaviniai/JauniejiProgramuotojai/duomenys.txt";
        List<JaunasisProgramuotojas> mokiniai = new ArrayList<>();
        int skaiciusMokiniu = skaityti(failoKelias,mokiniai);
        System.out.println(skaiciusMokiniu);
        System.out.println(mokiniai);


    }

    static Integer skaityti(String failoKelias, List<JaunasisProgramuotojas> x){

       Integer priimamuSkaicius = 0;
        BufferedReader br;

        try{
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            String[] reiksmes = line.split(" ");

            priimamuSkaicius =Integer.parseInt(reiksmes[0]);
            int visiMokiniai = Integer.parseInt(reiksmes[1]);

            for(int i = 0; i < visiMokiniai ; i++){
                line = br.readLine();
                reiksmes = line.split(" ");
                String[] reiksmes2 = reiksmes[0].split("_");

                String vardas = reiksmes2[0];
                String pavarde = reiksmes2[1];
                int balas = Integer.parseInt(reiksmes[1]);

                JaunasisProgramuotojas mokinys = new JaunasisProgramuotojas(vardas,pavarde,balas);
                x.add(mokinys);

            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
return priimamuSkaicius;
    }


}

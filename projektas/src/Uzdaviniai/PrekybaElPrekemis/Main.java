package Uzdaviniai.PrekybaElPrekemis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {










    static Map<String,Preke> skaityti(String failoKelias){
        Map<String, Preke> zemelapis = new HashMap<>();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            int prekiuKiekis = Integer.parseInt(line);

            for(int i = 0; i < prekiuKiekis;i++){
                line = br.readLine();
                int pirmoTarpoVieta = line.indexOf(" ");
             String id =   line.substring(0, pirmoTarpoVieta);
                System.out.println(id);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
return zemelapis;
    }
}

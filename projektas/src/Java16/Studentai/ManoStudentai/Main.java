package Java16.Studentai.ManoStudentai;

import Java7.uzdaviniai.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Java16/Studentai/ManoStudentai/Studentai.txt";

        Map<String,List<Studentas>> mapas = mapas(failoKelias);
//
//        System.out.println(mapas);
//for(int i =0; i < mapas.size();i++){
//
//    System.out.println(mapas.get(i).get);
//}



    }

    static Map<String, List<Studentas>> mapas(String filePath) {

        BufferedReader br;
        Map<String, List<Studentas>> mapas = new HashMap<>();
        List<Studentas> studentai = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (line != null) {
                String[] values = line.split(" ");
                String vardas = values[0];
                String pavarde = values[1];
                String grupe = values[2];

                if (mapas.containsKey(grupe)) {
                    mapas.get(grupe).add(new Studentas(vardas, pavarde, grupe));
                } else {
                    //   mapas.put(grupe, new ArrayList<>());
                    mapas.put(grupe, new ArrayList<>());
                    mapas.get(grupe).add(new Studentas(vardas, pavarde, grupe));
                }

                line = br.readLine();

            }
            br.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return mapas;
    }
}

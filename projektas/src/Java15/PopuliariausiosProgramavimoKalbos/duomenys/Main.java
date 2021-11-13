package Java15.PopuliariausiosProgramavimoKalbos.duomenys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        String filePath = "projektas/src/Java15/PopuliariausiosProgramavimoKalbos/duomenys/duomenys.txt";
        String filePath2 = "projektas/src/Java15/PopuliariausiosProgramavimoKalbos/duomenys/rezultatai.txt";


        ArrayList<ProgramavimoKalba> x = readFile(filePath);


        Collections.sort(x, (a, b) -> {
            int result = a.getPavadinimas().compareTo(b.getPavadinimas());
            if(result != 0){
                return result;
            }
            return a.getPokytis().compareTo(b.getPokytis());
        });

        spausdinti(filePath2,x);
    }

    static ArrayList<ProgramavimoKalba> readFile(String path) {
        BufferedReader br;
        ArrayList<ProgramavimoKalba> list = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            int LanguageNumber = Integer.parseInt(line);

//            while (line != null) {
            for (int i = 0; i < 6; i++) {
                line = br.readLine();
                String[] values = line.split(" ");
                String pavadinimas = values[0];
                Integer vieta2014 = Integer.parseInt(values[1]);
                Integer vieta2013 = Integer.parseInt(values[2]);
                double reitingas = Double.parseDouble(values[3]);
                double pokytis = Double.parseDouble(values[4]);

                ProgramavimoKalba kalba = new ProgramavimoKalba(pavadinimas, vieta2014, vieta2013, reitingas, pokytis);
                list.add(kalba);

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    static void spausdinti(String failokelias, ArrayList<ProgramavimoKalba> kalba) {
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(failokelias));
for(int i = 0; i < kalba.size(); i++){
    bw.write(kalba.get(i).toString());
    bw.newLine();

}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

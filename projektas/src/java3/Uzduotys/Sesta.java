package java3.Uzduotys;

import java.io.*;

public class Sesta {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("projektas/src/java3/Uzduotys/sesta.txt"));
            bw = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/sesta-rezultatas.txt"));
            String line = br.readLine();

            int ilgis = Integer.parseInt(line);
            int i = 0;
            for (i = 0; i < ilgis; i++) {
                System.out.println(i);
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Nerastas failas");
        } catch (IOException e) {
            System.out.println("Klaida");
        }

    }
}

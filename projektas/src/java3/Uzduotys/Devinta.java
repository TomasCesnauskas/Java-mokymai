package java3.Uzduotys;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Devinta {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("projektas/src/java3/Uzduotys/Devinta.txt"));
            bw = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/Devinta-atsakymas.txt"));
            String line = br.readLine();


            while (line != null) {
                int skaicius = Integer.parseInt(line);
                if (skaicius % 2 == 0) {
                   bw.write(skaicius + " - lyginis");
                    bw.newLine();
                } else {
                    bw.write(skaicius + " - nelyginis");
                    bw.newLine();
                }
                line = br.readLine();
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Tokio failo nera");
        } catch (IOException d) {
            System.out.println("Klaida");
        }
    }
}

package java3;


import java.io.*;
import java.net.URL;

public class SkaitymasIsFailo {
    public static void main(String[] args) {

        try {
           BufferedReader br = new BufferedReader(new FileReader("projektas/src/java3/tekstas.txt"));

            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Netiketa klaida");
        }

    }
}
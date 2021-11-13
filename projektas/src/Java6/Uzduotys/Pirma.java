package Java6.Uzduotys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Pirma {
    public static void main(String[] args) {
        String fileContent = "";
        try {
            fileContent =  readFile("NeegzistuojantisKelias");


        } catch (IOException e) {
            System.out.println("Skaitomas tsarginis failas");
            try {
                fileContent = readFile("projektas/src/Java6/uzduotys/tekstas.txt");
            } catch (IOException ioException) {
                System.out.println("Atsarginis failas nenuskaitomas");
            }
        }
        System.out.println(fileContent);

    }


    static String readFile(String filePath) throws IOException {
        String text = "";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        while(line != null){
            text = text + line;
            line = br.readLine();

        }
          br.close();
        return text;
    }
}

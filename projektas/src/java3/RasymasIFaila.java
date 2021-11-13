package java3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RasymasIFaila {

    public static void main(String[] args) {

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Hp\\Desktop\\projektas\\projektas\\src\\java3\\tekstas.txt"));

            bf.write("labas rytas");
            bf.close();
        } catch (IOException ex) {
            System.out.println("Nepavyko irasyti i faila");
        }
    }
}
package java3.Uzduotys;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AntraUzduotis {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/antra-rezultatas.txt"));
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("i  =" + i + " j = " + j);
                    bw.write("i  =" + i + " j = " + j);
                    bw.newLine();
                }
            }
        bw.close();}
        catch(FileNotFoundException e){
            System.out.println("Not found");
        }
        catch(IOException e){
            System.out.println("Klaida");
        }
    }
}

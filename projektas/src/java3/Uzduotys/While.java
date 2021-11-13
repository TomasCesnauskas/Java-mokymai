package java3.Uzduotys;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class While {

    public static void main(String[] args) {

        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/While-rezultatas.txt"));
            int i = 1;
            while (i <= 100) {
                System.out.println(i);
                String s=String.valueOf(i);
                bf.write(s);
                bf.newLine();
                i++;
            }

            i = i - 2;
            while (i > 0) {
                System.out.println(i);
                String s=String.valueOf(i);
                bf.write(s);
                bf.newLine();
                i--;
            }
        bf.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Nerasta");
        }
        catch (IOException e) {
            System.out.println("Klaida");
        }

    }
}
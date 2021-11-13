package java3.Uzduotys;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class KetvirtaUzduotis {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/ketvirta-rezultatas.txt"));
            int suma = 0;
//       int i = 0;
//
//        while (suma < 12) {
//          suma = suma + i;
//          i++;
//
//        }
//        System.out.println(suma);

            for (int i = 0; i < 1000; i++) {
                if (suma > 12) {
                    break;
                }
                suma = suma + i;

            }
            System.out.println(suma);
            bw.write(String.valueOf(suma));
            bw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File nt found");
        }
        catch(IOException e) {
            System.out.println("Error");
        }
        }
}
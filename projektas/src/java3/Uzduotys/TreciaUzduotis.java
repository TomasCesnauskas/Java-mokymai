package java3.Uzduotys;

import java.io.*;

public class TreciaUzduotis {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/trecia-rezultatas.txt"));
            int suma = 0;
            for (int i = 0; i < 5; i++) {
                suma += i;
            }
            System.out.println("Suma = " + suma);
            bw.write(String.valueOf (suma));
            bw.newLine();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nerastas failas");
        } catch (IOException e) {
            System.out.println("Klaida");
        }
    }
}

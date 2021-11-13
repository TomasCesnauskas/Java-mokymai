package java3.Uzduotys;

import java.io.*;

public class PenktaUzduotis {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("projektas/src/java3/Uzduotys/penkta-rezultatas.txt"));
            int i = 0;
            for (i = 0; i < 50; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    bw.write(String.valueOf(i));
                    bw.newLine();
                } else {
                }

            }
            bw.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}

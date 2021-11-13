package java3.Uzduotys;

import java.io.*;

public class Septinta {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Hp\\Desktop\\projektas\\projektas\\src\\java3\\Uzduotys\\Septinta.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Hp\\Desktop\\projektas\\projektas\\src\\java3\\Uzduotys\\Septinta-rezultatas.txt"));
            String line = br.readLine();
            System.out.println(line);

            while (line != null) {

                System.out.println(line);
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nera tokio failo");
        } catch (IOException e) {
            System.out.println("Klaida");
        }

    }
}

package java3.Uzduotys;

import java.io.*;

public class Astunta {
    public static void main(String[] args) {
        BufferedReader br = null;
        int kiekis = 0;
        int suma = 0;

        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Hp\\Desktop\\projektas\\projektas\\src\\java3\\Uzduotys\\Astunta.txt"));
            String line = br.readLine();

            while (line != null) {

                suma += Integer.parseInt(line);
                kiekis++;
                line = br.readLine();
            }
            System.out.println(1.0 * suma / kiekis);
            br.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}

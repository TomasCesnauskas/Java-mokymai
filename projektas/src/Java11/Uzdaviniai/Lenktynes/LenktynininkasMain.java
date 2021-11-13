package Java11.Uzdaviniai.Lenktynes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LenktynininkasMain {
    public static void main(String[] args) {

        String FilePath = "projektas/src/Java11/Uzdaviniai/Lenktynes/duomenys.txt";
        Lenktynininkas[] lenktynininkai = skaityti(FilePath);

        System.out.println(lenktynininkai.length);
        Lenktynininkas taupiausias = maziausiaiSunaudotaDegalu(lenktynininkai);
        System.out.println("Maziausiai degalu sunaudojo " + taupiausias.getNumeris() + " lenktynininkas");

    }

    static Lenktynininkas maziausiaiSunaudotaDegalu(Lenktynininkas[] y) {
        int minIndeksas = 0;

        for (int i = 1; i < y.length; i++) {
            if (y[minIndeksas].degaluVidurkis() > y[i].degaluVidurkis()) {
                minIndeksas = i;
            }

        }
        return y[minIndeksas];
    }


    static Lenktynininkas[] skaityti(String filePath) {

        Lenktynininkas[] masyvas = new Lenktynininkas[0];
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filePath));

            String line = br.readLine();

            int lenktynininkuKiekis = Integer.parseInt(line);
            masyvas = new Lenktynininkas[lenktynininkuKiekis];

            for (int i = 0; i < lenktynininkuKiekis; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");

                String numeris = reiksmes[0];
                int ratuKiekis = Integer.parseInt(reiksmes[1]);

                double[] sunaudotiDegalai = new double[ratuKiekis];
                for (int j = 2; j < ratuKiekis + 2; j++) {
                    sunaudotiDegalai[j - 2] = Double.parseDouble(reiksmes[j]);

                }
                Lenktynininkas x = new Lenktynininkas(numeris, sunaudotiDegalai);
                masyvas[i] = x;

            }

            br.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return masyvas;
    }

}

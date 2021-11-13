package Java11.Uzdaviniai.ManoLenktynes;

import java.io.BufferedReader;
import java.io.FileReader;

public class LenktynininkasMain {
    public static void main(String[] args) {

        String filePath = "projektas/src/Java11/Uzdaviniai/ManoLenktynes/duomenys.txt";


//readFile(filePath);



    }
    static void readFile(String filePath){

        BufferedReader br;


        try{
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            int lenktynininkuKiekis = Integer.parseInt(line);
            String lenktynininkoNR = "";
            int ratuSkaicius = 0;
            double[] degaluSunaudojimas = new double[ratuSkaicius];
            Lenktynininkas[]lenktynininkai = new Lenktynininkas[lenktynininkuKiekis];
            for(int i = 1; i <= lenktynininkuKiekis; i++){
                line = br.readLine();
                String[] informacija = line.split(" ");
                lenktynininkoNR = informacija[0];
                ratuSkaicius = Integer.parseInt(informacija[1]);

                for(int j = 1; j <= ratuSkaicius; j++){

                  degaluSunaudojimas[j] = Integer.parseInt(informacija[i+2]);
                }


                Lenktynininkas lenktynininkas = new Lenktynininkas(lenktynininkoNR,ratuSkaicius,degaluSunaudojimas);
                lenktynininkai[i] = lenktynininkas;


            }





br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package Uzdaviniai;

import java.io.BufferedReader;
import java.util.Scanner;

public class Karnavalas {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        int kiekis = 0;
        int visasKiekis = 0;
        System.out.println("Įveskite kiek balų gavo mokinys:");
        int balas = reader.nextInt();

        while(balas != 0){
            if(balas >= 5){
                kiekis++;
            }
            System.out.println("Įveskite kiek balų gavo mokinys:");
            balas = reader.nextInt();
            visasKiekis++;


        }

        System.out.println(visasKiekis + " "  + kiekis);
    }
}

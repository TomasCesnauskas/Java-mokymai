package Uzdaviniai;

import java.util.Scanner;

public class Statybininkas {
    public static void main(String[] args) {

        Scanner skaityti = new Scanner(System.in);

        System.out.println("Sienos ilgis");

        int a = skaityti.nextInt();

        System.out.println("Sienos aukstis");

        int h = skaityti.nextInt();

        System.out.println("Plytos kaina");

        double kaina = skaityti.nextDouble();

        System.out.println("Plytu kiekis " + kiekPlytu(a,h));
        System.out.println("Plytos kainuos " + visaKaina(kaina,a,h));



    }

    static double kiekPlytu(int a, int h){

        double kiekPlytu = (a * h)/0.02;
        return kiekPlytu;
    }
    static double visaKaina(double kaina, int a, int h){

       double visaKaina =  kiekPlytu(a,h) * kaina;
       return  visaKaina;
    }
}

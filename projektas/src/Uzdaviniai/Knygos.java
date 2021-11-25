package Uzdaviniai;

import java.io.BufferedReader;
import java.util.Scanner;

public class Knygos {
    public static void main(String[] args) {


        Scanner skaityti = new Scanner(System.in);

        System.out.println("Iveskite knygos skyriu skaiciu");
        int knygosSkyriai = skaityti.nextInt();
        int knygosSkyriai2 = knygosSkyriai;


        int perskaitytiSkyriai= 1;
        int dienos = 0;

        while(knygosSkyriai > 0){

            knygosSkyriai=knygosSkyriai-perskaitytiSkyriai;
            perskaitytiSkyriai++;


            dienos++;

        }
        double vidurkis = 1.0 * knygosSkyriai2/dienos;

        System.out.println(dienos);
        System.out.println(vidurkis);
    }
}

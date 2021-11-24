package Uzdaviniai;

import java.util.Scanner;

public class Kuliukai {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite kauliuku kieki");

        int n = reader.nextInt();
        int max = 0;
        int visiTaskai = 0;
        double vidurkis = 0;


        for(int i = 0; i < n; i++){

            System.out.println(i+1 +" -o kauliuko tasku kiekis");
            int taskai = reader.nextInt();
            max += 6;
            visiTaskai += taskai;

        }
        vidurkis =1.0* visiTaskai/n;
        String arLaimeta = "";

        if(vidurkis > visiTaskai/2){

            arLaimeta = "Loterija laimeta";
        }else{
             arLaimeta = "Loterija pralaimeta";
        }

        System.out.println("Max = " + max + " Visi taskai = "+ visiTaskai + " Vidurkis = " +vidurkis + "\n"  + arLaimeta  );


    }
}

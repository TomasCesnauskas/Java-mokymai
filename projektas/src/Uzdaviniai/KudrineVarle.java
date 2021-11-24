package Uzdaviniai;

import java.util.Scanner;

public class KudrineVarle {
    public static void main(String[] args) {

        Scanner skaityti = new Scanner(System.in);

        System.out.println("Kiek sveria varle");

        int varlesSvoris = skaityti.nextInt();

        System.out.println("Kiek varliu norima stebeti");

        int kiekVarliu = skaityti.nextInt();


        if(varlesSvoris * kiekVarliu > 5000){

            System.out.println("Varliu stebejimui pakanka");
        }else{
            System.out.println("Varlių stebėjimui per mažai");
        }


    }
}

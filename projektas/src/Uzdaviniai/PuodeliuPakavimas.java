package Uzdaviniai;

import java.util.Scanner;

public class PuodeliuPakavimas {
    public static void main(String[] args) {


        Scanner skaityti = new Scanner(System.in);

        System.out.println("Puodeliai kurius reikia supakuoti");

        int m = skaityti.nextInt();

        int pilnosDezes = m/3 ;

        int nesupakuoti = m -(pilnosDezes * 3);

        System.out.println("Dezuciu skaicius " + pilnosDezes);
        System.out.println("Nesupakuota " + nesupakuoti);

    }
}

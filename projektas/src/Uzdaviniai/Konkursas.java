package Uzdaviniai;

import java.util.Scanner;

public class Konkursas {
    public static void main(String[] args) {

        Scanner skaityti = new Scanner(System.in);

        System.out.println("Iveskite intervalo pradzia");

        int pradzia = skaityti.nextInt();

        System.out.println("Iveskite intervalo pabaiga");

        int pabaiga = skaityti.nextInt();

        int marskineliai = 0;
        for(int i = pradzia; i <= pabaiga; i++){

if(i % 6 == 0){

    marskineliai++;
}
        }
        System.out.println("Reikalingu marskineliu skaicius " + marskineliai);
    }

}

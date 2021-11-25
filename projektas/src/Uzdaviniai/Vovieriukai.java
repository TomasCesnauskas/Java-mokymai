package Uzdaviniai;

import java.util.Scanner;

public class Vovieriukai {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        System.out.println("Sukauptas riesutu kiekis");
        int x = reader.nextInt();
        System.out.println("Vovieriuku skaicius");
        int v = reader.nextInt();

        int dienuUzteks = 0;
        int visosVoveres = v+1;

        while(x >= visosVoveres*3){
           x= x-(visosVoveres*3);

           dienuUzteks++;
        }
        System.out.println("Riešutų sukaupta " + dienuUzteks +" dienoms");

    }
}

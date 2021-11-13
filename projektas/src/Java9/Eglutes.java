package Java9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Eglutes {
    public static void main(String[] args) {

    //su scanner nustatyti kiek egluciu
    //sukti cikla
    //ciklo metu nuskaityti kiekvienos eglutes auksti
    //sudeti aukscius i viena kintamaji

    Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek egluciu atvezta?");
        double skaicius = scanner.nextDouble();
        double suma = 0;

        for(int i = 1; i <= skaicius; i++){
            System.out.println("Iveskite " + i +" eglutes auksti: ");
            suma+= scanner.nextDouble();
        }
    double vidurkis = suma/skaicius;
        System.out.println("Eglutes auksciu vidurkis = " + vidurkis);
        scanner.close();

}

}

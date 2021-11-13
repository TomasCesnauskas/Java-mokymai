package Java2;

import java.util.Scanner;

public class StaciakampioPlotas {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite a");
        double a = reader.nextInt();
        System.out.println("Iveskite b");
        double b = reader.nextDouble();
        reader.close();

        double plotas = a * b;
        double perimetras = a * 2 + b * 2;

        System.out.println("Perimetras = " + perimetras);
        System.out.println("Plotas = " + plotas);



    }

}
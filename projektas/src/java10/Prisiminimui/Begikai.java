package java10.Prisiminimui;

import java.util.Scanner;

public class Begikai {
    public static void main(String[] args) {

        double minLaikas = Double.MAX_VALUE;
        double sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek dalyvavo begiku: ");
        int n = reader.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Iveskite " + i + " begiko laika:");
            double ivestasSkaicius = reader.nextDouble();
            sum += ivestasSkaicius;
            if (minLaikas > ivestasSkaicius) {
                minLaikas = ivestasSkaicius;
            }

        }
        reader.close();
        double vidurkis = sum / n;
        double geresnisUzVidurki = vidurkis-minLaikas;

        System.out.println("Vidurkis = " + vidurkis);
        System.out.println("Greiciausias laikas = " + minLaikas);
        System.out.println("Jis buvo " + geresnisUzVidurki + " sek geresnis uz vidurki");

    }
}

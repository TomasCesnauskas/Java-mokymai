package Java17.uzduotis;

import java.util.Scanner;

public class Degalai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite kuro bako talpa: ");

        int t = sc.nextInt();
        System.out.println("Iveskite kuro sanaudas: ");

        int n = sc.nextInt();
        int dienos = 0;

        while (t > 0) {
            if (dienos % 2 == 0) {
                t = t - n;
                dienos++;
                if (t < 2 * n) {
                    break;
                }


            } else {
                t = t - 2 * n;
                dienos++;
                if (t < n) {
                    break;
                }

            }}
            System.out.println("Keliauti bus galima " + dienos + " dienas.");


    }
}
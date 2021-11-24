package Uzdaviniai;

import Java20.demo2_Command.Switch;

import java.util.Scanner;

public class JonukoProblema {
    public static void main(String[] args) {

        Scanner skaityti = new Scanner(System.in);

        System.out.println("Iveskite uzduoties varianta");

        int uzduotis = skaityti.nextInt();

        System.out.println("Iveskite a reiksme");

        int a = skaityti.nextInt();

        System.out.println("Iveskite b reiksme");

        int b = skaityti.nextInt();
        int result = 0;

        switch (uzduotis) {

            case 1:
                result = a * b + 3;
                break;
            case 2:
                result = a + b;
                break;

            case 3:
                result = a - b;
                break;
        }
        System.out.println(result);
    }
}

package java3.Uzduotys;

import java.io.IOError;
import java.util.Scanner;

public class DesimtaUzduotis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int diena = reader.nextInt();
try{
        switch (diena) {

            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;

            case 3:
                System.out.println("Treciadienis");
                break;

            case 4:
                System.out.println("Ketvirtadienis");
                break;

            case 5:
                System.out.println("Penktadienis");
                break;

            case 6:
                System.out.println("Sestadienis");
                break;

            case 7:
                break;
            default:
                System.out.println("Tokios dienos nera");
        }
}catch (IOError f) {
    System.out.println("Neteisinga ivestis");

    }
}
    }

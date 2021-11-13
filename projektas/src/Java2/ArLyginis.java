package Java2;

import java.util.Scanner;

public class ArLyginis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        double skaicius = reader.nextDouble();

        if (skaicius % 2 ==0){
            System.out.println("Skaicius lyginis");
        }
        else if (skaicius % 2 != 0){
            System.out.println("Skaicius nelyginis");

        }
    }
}

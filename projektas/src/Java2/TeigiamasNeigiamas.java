package Java2;

import java.util.Scanner;

public class TeigiamasNeigiamas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        double number = reader.nextDouble();
        reader.close();

        if (number > 0) {
            System.out.println("Skaicius teigiamas");
        } else if (number < 0) {
            System.out.println("Skaicius neigiamas");
        } else
            System.out.println("Skaicius = 0");

    }

}

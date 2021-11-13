package Java2;

import java.util.Scanner;

public class DienosSkaicius {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite dienos skaiciu");

        int dienosSkaicius = reader.nextInt();

        reader.close();

        if (dienosSkaicius == 1) {
            System.out.println("Pirmadienis");
        } else if (dienosSkaicius == 2) {
            System.out.println("Antradienis");
        } else {
            System.out.println("Tokios dienos nera");


        }
    }
}

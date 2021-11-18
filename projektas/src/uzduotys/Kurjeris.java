package uzduotys;

import java.util.Scanner;

public class Kurjeris {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite suma:");
        int virsijo100 = 0;
        int n = 0;
        double vid = 0;
        int skaicius = reader.nextInt();
        double suma = 0;


        while (skaicius != 0) {
            n++;
            suma += skaicius;
            if (skaicius > 100) {
                virsijo100++;
            }

            System.out.println("Iveskite suma:");

            skaicius = reader.nextInt();
        }
        if(suma != 0){
            vid = 1.0* suma / n;
        }


        System.out.println("1.  " + virsijo100 + "   2.  " + vid + "   3.  " + n);

    }
}

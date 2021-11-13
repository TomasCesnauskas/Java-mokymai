package Java2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Geles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("kiek geliu zydi?");
        int zydiGeles = reader.nextInt();
        System.out.println("Kiek geliu razysta per viena diena?");
        int prazystaGeles = reader.nextInt();
        System.out.println("Kiek dienu zydi geles?");
        int dienuZydi = reader.nextInt();
        reader.close();

        int kiekZydiGeliu = zydiGeles + prazystaGeles * dienuZydi;
        System.out.println(kiekZydiGeliu);

    }
}

package Uzdaviniai;

import java.util.Scanner;

public class snaiges {
    public static void main(String[] args) {
        Scanner skaityti = new Scanner(System.in);

        System.out.println("Kiek snaigiu nukrito pirma sekunde");
        int snaigiuSkaicius = skaityti.nextInt();

        System.out.println("Kiek sekundziu");
        int sekundes = skaityti.nextInt();
        int snaigiuSkaiciusVisas=0;

        for( int i = 0; i < sekundes; i++){
            if(i == 0) {
                snaigiuSkaiciusVisas = snaigiuSkaicius;
            }else{
                snaigiuSkaicius = snaigiuSkaicius*2;
                snaigiuSkaiciusVisas = snaigiuSkaiciusVisas + snaigiuSkaicius;
            }
        }
        System.out.println(snaigiuSkaiciusVisas);
    }
}

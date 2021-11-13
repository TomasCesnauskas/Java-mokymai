package Java12;

import java.util.Scanner;

public class Atvirukai {
    public static void main(String[] args) {

// Susikurti kintamaji saugoti kiek tinka atviruku
        // Susikurti kintamaji m draugu kiekiui
        // Susikurti kintamaji n atviruku rusiu kiekiui
        // Nuskaityti atviruko rusies kieki
        // Patikrinti ar uztenka



        Scanner skaityti = new Scanner(System.in);
int kiekTinka = 0;
        System.out.println("Keliems draugams Linas nori dovanoti atvirukus?");
        int m = skaityti.nextInt();
        System.out.println("Kiek rusiu atviruku yra parduotuveje?");
        int n = skaityti.nextInt();

for(int i = 1; i <= n; i++){
    System.out.println("Kiek yra " + i + "rusies atviruku?");
    int x = skaityti.nextInt();
    if(x >= m){
        kiekTinka++;
    }

}
        System.out.println(kiekTinka);


    }
}

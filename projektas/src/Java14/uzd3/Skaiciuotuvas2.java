package Java14.uzd3;

import java.util.Scanner;

public class Skaiciuotuvas2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite veiksma:");
        int veiksmas = reader.nextInt();

        int skaicius = reader.nextInt();
        int rezultatas = 0;
        int i = 0;
        while (skaicius != 0) {

            switch (veiksmas) {

                case 1: {//suma
                    rezultatas = rezultatas + skaicius;
                    break;
                }
                case 2: {
                    //atimtis
                    if (i == 0) {
                        rezultatas = skaicius;
                    } else {
                        rezultatas = rezultatas - skaicius;
                    }
                    break;
                }
                case 3: {
                    if (i == 0) {
                        rezultatas = 1;
                    } else {
                        rezultatas = rezultatas * skaicius;
                    }
                    //daugyba
                    break;
                }
                case 4: {
                    //didziausia reiksme
                    if (i == 0) {

                        rezultatas = skaicius;
                    } else {
                        if (rezultatas < skaicius) {
                            rezultatas = skaicius;
                        }
                    }
                    break;
                }
                case 5: {
                    //mziausias skaicius
                    if (i == 0) {

                        rezultatas = skaicius;
                    } else {
                        if (rezultatas > skaicius) {
                            rezultatas = skaicius;
                        }
                    }
                    break;
                }
            }
            i++;
            skaicius = reader.nextInt();

        }
        System.out.println(rezultatas);
    }

}

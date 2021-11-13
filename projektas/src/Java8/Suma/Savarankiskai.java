package Java8.Suma;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Savarankiskai {
    public static void main(String[] args) {
        String tekstas = "Labas rytas. Kaip sekasi";
        int zodziuSkaicius = zodziuSuma(tekstas);
        System.out.println("Zodziu skaicius:" + zodziuSkaicius);
        String slaptazodis = "595855";
        boolean arGeras = tikrintiSlaptazodi(slaptazodis);
        System.out.println("Ar geras slaptazodis " + arGeras);

        System.out.println("-----------------------------------------------");

        int[] skaiciuMasyvas = {5, 6, 5, 47, 8, 9, 6, 5};
        int skaicius = 5;
        int kiekKartojasi = kiekKartuKartojasi(skaiciuMasyvas, skaicius);
        System.out.println("Skaicius " + skaicius + " kartojasi " + kiekKartojasi + " kartus.");
        System.out.println("-----------------------------------------------");
     //  System.out.println("Iveskite skaiciu");
      //  System.out.println(scaner());
        System.out.println("-----------------------------------------------");
        int skaicius1 = 555;
        System.out.println("Ar skaicius " + skaicius1+ " yra palindromas?  -" + arPalindromas(skaicius1));
        System.out.println("-----------------------------------------------");
        int x = 10;
        int y = 5;
        System.out.println("-----------------------------------------------");


        System.out.println("Skaicius x yra dvigubai didesnis uz skaiciu y - " + isDoubleBigger(x,y));
        System.out.println("-----------------------------------------------");

        System.out.println(randomNumb(5,6));
        String zodis = "kazkoksai";
        System.out.println(gautiAtsitiktineZodzioRaide(zodis));

    }
    public static int zodziuSuma(String x) {

        String[] zodziai = x.split(" ");
        return zodziai.length;
    }
    public static boolean tikrintiSlaptazodi(String s) {
        //     return s.length() > 8; ta pati daro
        if (s.length() > 8) {
            return true;
        }
        return false;
    }
    public static int kiekKartuKartojasi(int[] array, int reiksme) {
        int kartojasi = 0;
        for (int skaicius : array) {
            if (skaicius == reiksme) {
                kartojasi += 1;
            }
        }
        return kartojasi;
    }
    public static int scaner(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
    public static boolean arPalindromas(int skaicius){
      String  skaiciusString = String.valueOf(skaicius);
      char[] skaiciusChar = skaiciusString.toCharArray();
      String atvirksciasSkaicius = "";
      for(int i = skaiciusChar.length - 1; i >= 0; i-- ){
          atvirksciasSkaicius = atvirksciasSkaicius + skaiciusChar[i];
      }
      return skaiciusString.equals(atvirksciasSkaicius) ;
    }
public static boolean isDoubleBigger(int number1, int number2) {
    return (number1 == 2 * number2);

}
public static int randomNumb(int x, int y){
    int randomNum = ThreadLocalRandom.current().nextInt(x, y);
return randomNum;
}
//public static char randomLetter(String word){
//        char[] simboliai = word.toCharArray();
//        randomNumb(simboliai[0],simboliai[simboliai.length-1];
//}

    public static char gautiAtsitiktineZodzioRaide(String zodis){
        int atsitiktinisSkaicius = randomNumb(0, zodis.length()-1);
        return zodis.charAt(atsitiktinisSkaicius);

    }
}

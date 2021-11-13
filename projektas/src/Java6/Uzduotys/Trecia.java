package Java6.Uzduotys;

import java.util.Scanner;

public class Trecia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        String text = scanner.next();
        try {
            int number = Integer.parseInt(text);
            System.out.println("Jusu skaicius = " + number);
        }catch (NumberFormatException e){
            System.out.println("Neteisingas formatas");
        }
    }



}

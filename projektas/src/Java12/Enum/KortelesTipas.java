package Java12.Enum;

import java.util.Scanner;

public class KortelesTipas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite korteles numeri");
        String cardNumber = reader.nextLine();

        if (Card.VISA.isCorrectType(cardNumber)) {
            System.out.println("Kortele Visa");
        } else if (Card.MASTERCARD.isCorrectType(cardNumber)) {
            System.out.println("Kortele MASTERCARD");
        } else {
            System.out.println("Kortele neatpazinta");
        }

    }
}
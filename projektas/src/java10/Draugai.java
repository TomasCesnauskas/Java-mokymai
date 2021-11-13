package java10;

import java.util.Scanner;

public class Draugai {
    public static void main(String[] args) {

    Scanner read = new Scanner(System.in);
       int kiekLyginiu = 0;

       for(int i = 1; i <= 10; i++){
           System.out.println("Iveskite " + i + "-ojo draugo skaiciu");
           int sugalvotasSkaicius = read.nextInt();

           if(sugalvotasSkaicius %2 == 0 ){
               kiekLyginiu++;

           }
           if(kiekLyginiu > 0){
               System.out.println(kiekLyginiu);
           }
           else{
               System.out.println("Nera");
       }}
read.close();
}
}

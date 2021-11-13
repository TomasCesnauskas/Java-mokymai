package java10.Payments;

import java.util.Arrays;

public class PaymentMain {

    public static void main(String[] args) {
        Employee darbuotojas = new Employee("LT123", 500);
        Client klientas = new Client("LT 456", 999);

        Payment[] masyvas = {darbuotojas, klientas};
        for(int i = 0; i < masyvas.length; i++){
            System.out.println(masyvas[i].getAmount());
        }
        Client klientas1 = new Client("LT123", new double[]{200, 100, 50});
        Client klientas2 = new Client("LT456", new double[]{200, 100, 50, 99, 59});
        Client klientas3 = new Client("LT789", new double[]{200, 100, 50, 90});
        Client klientas4 = new Client("LT142", new double[]{200, 100, 50, 24, 22});
        Client klientas5 = new Client("LT173", new double[]{200, 100, 50});

Client[] klientai = {klientas1,klientas2,klientas3,klientas4,klientas5};
Client[] daugiausiaiMokantys = daugiausiaMokejimu(klientai);
spausdinti(daugiausiaiMokantys);

Client[] duKartVidurkis = mokejimasVirsijaVidurkiDuKartus(klientai);
        System.out.println("klientai kuriu mokejimai virsija visu mokejimu vidurki 2 kartus ");
        spausdinti(duKartVidurkis);


    }
    static int didziausiasMokejimuSkaicius(Client[] x){
        int max = 0;
        for(int i = 0; i <x.length; i ++ ) {
            if(max < x[i].getPayments().length){
                max = x[i].getPayments().length;
            }
        }
        return max;
    }

    static Client[] daugiausiaMokejimu(Client[] y) {
        Client[] daugiausiaMokantys = new Client[0];
        int max = didziausiasMokejimuSkaicius(y);
        for(int i = 0; i < y.length; i++)  {
            if(max == y[i].getPayments().length);
            daugiausiaMokantys = Arrays.copyOf(daugiausiaMokantys,daugiausiaMokantys.length+1);
            daugiausiaMokantys[daugiausiaMokantys.length -1] = y[i];
        }
        return daugiausiaMokantys;
    }
    static void spausdinti(Client[] z){
        for(int i =0; i < z.length; i++){
            System.out.println(z[i].getBankAccount() + " " + z[i].getPayments().length);

        }
    }
    static double mokejimoVidurkis(Client[] a){
        double suma = 0;
        int kiekis = 0;
        for(int i = 0; i < a.length; i++){
            suma += a[i].getAmount();
            kiekis = kiekis + a[i].getPayments().length;
        }


        return suma / kiekis;
    }
    static Client[] mokejimasVirsijaVidurkiDuKartus(Client[]b){
        Client[] virsijaVidurkiDuKartus = new Client[0];
        double vid = mokejimoVidurkis(b);

        for(int i =0; i < b.length; i++){
            for(int j = 0; j < b[i].getPayments().length; j++){
                double mokejimas = b[i].getPayments()[j];
                if(mokejimas > vid * 2) {
                    virsijaVidurkiDuKartus = Arrays.copyOf(virsijaVidurkiDuKartus, virsijaVidurkiDuKartus.length+1);
                    virsijaVidurkiDuKartus[virsijaVidurkiDuKartus.length-1] = b[i];
                    break;
                }
            }
        }
        return virsijaVidurkiDuKartus;
    }
}

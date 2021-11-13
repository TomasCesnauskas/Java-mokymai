package Java6.Uzduotys;

import Java5.uzduotys.PirmaUzduotis;

public class Penkta {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array =  iterptiElementa(array, 9, 10);
        spausdintiMasyva(array, "Mano masyvas");
    }


    static int[] iterptiElementa(int[] masyvas, int reiksme, int vieta) {
        int[] laikinas = new int[masyvas.length + 1];
        int pridejimoVieta = 0;

        for(int i = 0; i < masyvas.length; i++) {
            if(i == vieta) {
                laikinas[pridejimoVieta] = reiksme;
                pridejimoVieta = pridejimoVieta + 1;
            }
            laikinas[pridejimoVieta] = masyvas[i];
            pridejimoVieta = pridejimoVieta + 1;

        }
        return laikinas;
    }
    static void spausdintiMasyva(int[] spausdinamasMasyvas, String tekstas){
        System.out.println(tekstas);
        for(int i = 0; i < spausdinamasMasyvas.length; i++){
            System.out.print(spausdinamasMasyvas[i]);
        }
    }
}

package Java5.uzduotys;

public class PirmaUzduotis {
    public static void main(String[] args) {
        int[] masyvas = {1,2,3,4,5,6,7};
        spausdintiMasyva(masyvas,"Musu masyvas");
        int[] masyvas2 = {2,4,0,3,-1 };
        spausdintiMasyva(masyvas2,"Kauno Zalgiris laimes");

    }

    static void spausdintiMasyva(int[] spausdinamasMasyvas, String tekstas){
        System.out.println(tekstas);
        for(int i = 0; i < spausdinamasMasyvas.length; i++){
            System.out.println(spausdinamasMasyvas[i]);
        }
    }
}

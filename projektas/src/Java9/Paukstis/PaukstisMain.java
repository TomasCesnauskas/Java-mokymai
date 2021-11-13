package Java9.Paukstis;

public class PaukstisMain {
    public static void main(String[] args) {

        Kregzde kregzde = new Kregzde();
        kregzde.kregzdesMetodas();

        Paukstis kregzde2 = new Kregzde();
        ((Kregzde)kregzde2).kregzdesMetodas();


    }
}

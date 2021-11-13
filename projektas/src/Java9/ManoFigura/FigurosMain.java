package Java9.ManoFigura;

public class FigurosMain {
    public static void main(String[] args) {

//        Staciakampis figura1 = new Staciakampis(5,4);
//        Kvadratas figura2 = new Kvadratas(8);
//        StatusisTrikampis figura3 = new StatusisTrikampis(8,3,6);
//
//        Figura[] visosFiguros = {figura1,figura2,figura3,figura1,figura2};
//        Figuros konteineris = new Figuros(visosFiguros);
//        konteineris.spausdintiMasyva();

        String path = "projektas/src/Java9/ManoFigura/figuros.txt";

        Figuros konteineris = new Figuros();

        konteineris.readFile(path);
        konteineris.spausdintiMasyva();

        Figura didziausiasPlotas = konteineris.didziausiasPlotas();
        System.out.println("Figura kurios plotas didziausias: " + didziausiasPlotas);

        Figura didziausiasPerimetras = konteineris.didziausiasPerimetras();
        System.out.println("Figura kurios didziausias perimetras: " + didziausiasPerimetras);

        Figura ilgiausiakrastine = konteineris.ilgiausiaKrastine();
        System.out.println("Figura su ilgiausia krastine: " + ilgiausiakrastine);



    }
}

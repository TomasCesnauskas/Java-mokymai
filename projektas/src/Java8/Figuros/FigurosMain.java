package Java8.Figuros;

public class FigurosMain {
    public static void main(String[] args) {

        String failoKelias = "projektas/src/Java8/Figuros/figuros.txt";
        Figuros konteineris = new Figuros();
        konteineris.skaitytiFaila(failoKelias);
        konteineris.spausdinti();

//didziausia plota turinti figura

        System.out.println("Didziausia plota turinti figura:");
        Figura didziauisiasPlotas = konteineris.didziausiasPlotas();
        System.out.println(didziauisiasPlotas);

        System.out.println("Ilgiausia krastine geresniu budu");
        Figura ilgiausiaKrastineGeresnis = konteineris.ilgiausiaKrastineGeresnis();
        System.out.println(ilgiausiaKrastineGeresnis);


        //    Kvadratas kvadratas = new Kvadratas(2);
//    Staciakampis staciakampis = new Staciakampis(2,4);
//    StatusisTrikampis statusisTrikampis = new StatusisTrikampis(3, 4,5);
//
//    Figura[] figuros = {kvadratas, staciakampis, statusisTrikampis};
//    Figuros konteineris = new Figuros(figuros);
//    konteineris.spausdinti();

//}
    }
}
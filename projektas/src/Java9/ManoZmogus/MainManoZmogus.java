package Java9.ManoZmogus;

public class MainManoZmogus {
    public static void main(String[] args) {

        String path = "projektas/src/Java9/ManoZmogus/duomenys.txt";
        Studentas studentas = new Studentas("Tomas", "Tomaitis", 60, 3, "Programeris");
        Darbuotojas darbuotojas = new Darbuotojas("Jonas", "Jonaitis", 40, 20, "Destytojas");
        Studentas studentas2 = new Studentas("Juozas", "Juozaitis", 20, 1, "politika");
        Darbuotojas darbuotojas2 = new Darbuotojas("Julius", "Julinstas", 58, 33, "Suvirintojas");

        ManoZmogus[] saraselis = {studentas, darbuotojas, studentas2, darbuotojas2};
        Zmones pirmasSarasas = new Zmones(saraselis);


//        for(ManoZmogus zmones: pirmasSarasas.getSarasas()){
//            System.out.println(zmones.gautiZmogausInformacija());
//        }

//Visas sarasas
        //System.out.println("Visi zmones isvardinti zemiau:");
//        for(int i = 0; i < pirmasSarasas.getSarasas().length; i++){
//            System.out.println(pirmasSarasas.getSarasas()[i].gautiZmogausInformacija());
//
//        }
//        System.out.println(pirmasSarasas.getSarasas()[0].getVardas());
//
//        for(ManoZmogus amzius: pirmasSarasas.getSarasas()){
//            System.out.println( amzius.getAmzius());
//        }


//        ManoZmogus vyriausias = pirmasSarasas.getSarasas()[0];
//        for(int i = 1; i < pirmasSarasas.getSarasas().length; i++){
//            if( vyriausias.getAmzius() < pirmasSarasas.getSarasas()[i].getAmzius()){
//                vyriausias = pirmasSarasas.getSarasas()[i];
//            }
//        }
//        System.out.println("Vyriausias zmogus zemiau:");
//        System.out.println(vyriausias.gautiZmogausInformacija());
//}
Zmones antrasSarasas = new Zmones();
antrasSarasas.nuskaitytiFaila(path);
        antrasSarasas.spausdintiMasyva();
        ManoZmogus vyriausias = antrasSarasas.vyriausiasZmogus();
        System.out.println("Vyriausias zmogus: " + vyriausias.gautiZmogausInformacija());

//      pirmasSarasas.spausdintiMasyva();
//      pirmasSarasas.nuskaitytiFaila(path);



    }
}

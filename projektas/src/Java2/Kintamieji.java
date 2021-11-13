package Java2;

public class Kintamieji {
    public static void main(String[] args) {
        boolean name = true;
        System.out.println("Vardas=" + name);

        Boolean betterName = null;
        System.out.println("Kita reiksme="+betterName);

        int sveikasSkaicius=5;
        System.out.println("reiksme="+sveikasSkaicius);
        Integer geresnisSveikasSkaicius=null;
        System.out.println("Kita reiksme="+geresnisSveikasSkaicius);

        double nesveikasSkaicius = 6;
        System.out.println("Kita reiksme="+nesveikasSkaicius);
        Double geresnisNesveikasSkaicius= 6.0;
        System.out.println("Kita reiksme="+geresnisNesveikasSkaicius);

        String text = "Tekstas";
        String text2= "Tekstas2";
        System.out.println(text +" " + text2+(sveikasSkaicius+geresnisNesveikasSkaicius));
        System.out.println(sveikasSkaicius+geresnisNesveikasSkaicius + text + text2);

    }
}

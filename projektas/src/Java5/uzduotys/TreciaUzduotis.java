package Java5.uzduotys;

public class TreciaUzduotis {
    public static void main(String[] args) {

        int Skaicius = 6;
        ArLyginis(Skaicius);

    }

    static void ArLyginis(int a) {
        System.out.print("Skaicius " + a + " yra ");
        if (a % 2 == 0) {
            System.out.println("lyginis");
        } else {
            System.out.println("nelyginis");
        }
    }
}

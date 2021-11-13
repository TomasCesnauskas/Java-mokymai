package java3.Uzduotys;

public class DOWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 100);

        i = i - 1;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);

    }
}

package java3;

public class BreakNaudojimas {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if(i == 3) {
                break;
            }
        }
        System.out.println("Kodas po for'u");
    }
}
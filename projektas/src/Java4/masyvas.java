package Java4;

public class masyvas {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        System.out.println(a[1]);
        System.out.println(a[a.length - 1]);

        a[1] = 555;
        System.out.println(a[1]);

        int[] b = new int[5];
        b[0] = 2;
        b[1] = 3;
        b[2] = 4;
        b[3] = 5;
        b[4] = 6;

        System.out.println(b[3]);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}

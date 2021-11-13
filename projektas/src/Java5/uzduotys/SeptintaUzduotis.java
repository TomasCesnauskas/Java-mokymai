//package Java5.uzduotys;
//
//import java.util.Arrays;
//
//public class SeptintaUzduotis {
//    public static void main(String[] args) {
//
//        int[] array = {2, 3, 7, 10, 15, 4, 12};
//        int[] smallerNumbers = smallerNumbersThenTen(array);
//        PirmaUzduotis.spausdintiMasyva(smallerNumbers, "Skaiciai mazesni uz 10");
//        int[] smallerNumbers = smallerNumbers
//        PirmaUzduotis.spausdintiMasyva(smallerNumbersThan(array,4));
//    }
//
//    static int[] smallerNumbersThan(int[] array, int number) {
//        int[] smallerThan = new int[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > number) {
//                smallerThan = addElement(smallerThan, array[i]);
//            }
//        }
//        return smallerThan;
//    }
//
//    static int[] smallerNumbersThenTen(int[] array) {
//        int[] smallerThenTen = new int[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 10) {
//                smallerThenTen = addElement(smallerThenTen, array[i]);
//
//            }
//        }
//        return smallerThenTen;
//    }
//
//    static int[] addElement(int[] array, int value) {
//        array = Arrays.copyOf(array, array.length + 1);
//        array[array.length - 1] = value;
//        return array;
//
//
//    }
//}
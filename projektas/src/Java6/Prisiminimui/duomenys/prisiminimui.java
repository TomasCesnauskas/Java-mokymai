package Java6.Prisiminimui.duomenys;

import Java4.MasyvoElementoPridejimas;

import java.io.*;
import java.util.Arrays;

public class prisiminimui {


    public static void main(String[] args) {
        int[] data = readFile("C:\\Users\\Hp\\Desktop\\projektas\\projektas\\src\\Java6\\Prisiminimui\\duomenys\\duomenys.txt");

       // printArray(data);
        int sum = sum(data);
        System.out.println("Suma lygi " + sum);
        double vidurkis = average(sum, data.length);
        System.out.println("Vidurkis =" + vidurkis);
        int maziausia = maxValue(data);
        int didziausia = minValue(data);
        System.out.println("Maziausia reiksme = " + maziausia);
        System.out.println("Didziausia reiksme = " + didziausia);
        print("C:\\Users\\Hp\\Desktop\\projektas\\projektas\\src\\Java6\\Prisiminimui\\duomenys\\atsakymai.txt", data, sum, vidurkis, maziausia, didziausia);

    }


    static int[] readFile(String filepath) {
        int[] array = new int[0];

        try {
            BufferedReader bw = new BufferedReader(new FileReader(filepath));
            String line = bw.readLine();
            String[] values = line.split(",");

            for (String value : values) {
                int number = Integer.parseInt(value);
                array = pridetiElementa(array, number);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    static void printArray(BufferedWriter bufferedWriter, int[] array) throws IOException {
        for (int a : array) {
            bufferedWriter.write(a + "");
        }
    }

    public static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }

    static double average(int sum, int count) {
        return 1.0 * sum / count;
    }

    static int maxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    static int minValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int a : array) {
            if (a > min) {
                min = a;
            }
        }
        return min;
    }

    static void print(String filePath, int[] array, int sum, double average, int minValue, int maxValue) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            printArray(bw,array);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package Java5.uzduotys;

import java.io.*;
import java.util.Arrays;

public class DesimtaMetodaiJava4uzdaviniams {
    public static void main(String[] args) throws IOException {

        //kintamieji
        int[] masyvas = new int[0];
        int[] didesniSkaiciaiUzVidurki = new int[0];
        int[] neigiamiSkaiciai = new int[0];
        int[] pasikartojantysSkaiciai = new int[0];
        int[] surikiuotasMasyvas = new int[0];
        int suma = 0;
        int vidurkis = 0;


        try {
            BufferedReader bf = new BufferedReader(new FileReader("projektas/src/Java5/uzduotys/duomenys.txt"));
            String line = bf.readLine();
            while (line != null) {
                int skaicius = Integer.parseInt(line);
                masyvas = pridetiElementa(masyvas, skaicius);

                line = bf.readLine();
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tokio failo nera");

        } catch (IOException e) {
            System.out.println("Klaida");
        }
        //skaiciavimu vieta

        System.out.println(sum(masyvas));
        System.out.println(average(masyvas));
        System.out.println(min(masyvas));
        System.out.println(max(masyvas));
        printArray(deleteSmallerThanAverage(masyvas));
        System.out.println();
        printArray(arrayNegativeElements(masyvas));
        System.out.println();
        printArray(sameElement(masyvas));
        System.out.println();
        System.out.println(secondMin(masyvas));
        findNumber(masyvas, 3);
        System.out.println();
        printArray(sortedFromSmallestArray(masyvas));
        writeArray(masyvas);

//
//
//        int minIndeksas = 0;
//        int maxIndeksas = 0;
//        for (int i = 1; i < masyvas.length; i++) {
//            if (masyvas[minIndeksas] > masyvas[i]) {
//                minIndeksas = i;
//            }
//            if (masyvas[maxIndeksas] < masyvas[i]) {
//                maxIndeksas = i;
//            }
//        }
//
//        for (int i = 1; i < masyvas.length; i++) {
//            if (vidurkis < masyvas[i]) {
//                didesniSkaiciaiUzVidurki = pridetiElementa(didesniSkaiciaiUzVidurki, masyvas[i]);
//
//            }
//            if (masyvas[i] < 0) {
//                neigiamiSkaiciai = pridetiElementa(neigiamiSkaiciai, masyvas[i]);
//            }
//        }
//
//        for (int i = 0; i < masyvas.length; i++) {
//            for (int j = i + 1; j < masyvas.length; j++) {
//                if (masyvas[i] == masyvas[j]) {
//                    pasikartojantysSkaiciai = pridetiElementa(pasikartojantysSkaiciai, masyvas[i]);
//                    break;
//                }
//
//            }
//
//        }
//
//        int antrasMinIndeksas = 0;
//        int antrasMaxIndeksas = 0;
//
//        for (int i = 0; i < masyvas.length; i++) {
//
//            if (masyvas[i] > masyvas[minIndeksas] && masyvas[i] < masyvas[antrasMinIndeksas]) {
//                antrasMinIndeksas = i;
//            }
//            if (masyvas[i] < masyvas[maxIndeksas] && masyvas[i] > masyvas[antrasMaxIndeksas]) {
//                antrasMaxIndeksas = i;
//            }
//
//        }
//
//        boolean arEgzistuoja = false;
//        for (int i = 0; i < masyvas.length; i++) {
//            if (masyvas[i] == 8) {
//                arEgzistuoja = true;
//                break;
//            }
//        }
//        surikiuotasMasyvas = Arrays.copyOf(masyvas, masyvas.length);
//        int laikinas;
//        for (int i = 0; i < surikiuotasMasyvas.length; i++) {
//
//            for (int j = 1; j < surikiuotasMasyvas.length - i; j++) {
//                if (surikiuotasMasyvas[j - 1] > surikiuotasMasyvas[j]) {
//                    laikinas = surikiuotasMasyvas[j - 1];
//                    surikiuotasMasyvas[j - 1] = surikiuotasMasyvas[j];
//                    surikiuotasMasyvas[j] = laikinas;
//                }
//            }
//        }


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("projektas/src/Java5/uzduotys/atsakymai.txt"));

            bw.write("Nuskaityti duomenis");
            bw.newLine();
            writeArray(masyvas);
//            for (int i = 0; i < masyvas.length; i++) {
//                bw.write(masyvas[i] + "");
//            }
            bw.newLine();
            bw.write("1.Apsuktas masyvas");
            bw.newLine();
            for (int i = masyvas.length - 1; i >= 0; i--) {
                bw.write(masyvas[i] + "");

//                bw.newLine();

            }
            bw.newLine();
            bw.write("2.Suma ir Vidurkis");
            bw.newLine();
            bw.write("Suma = " + sum(masyvas));
            bw.newLine();
            bw.write("Vidurkis = " + average(masyvas));
            bw.newLine();
            bw.write("3. Min ir Max");
            bw.newLine();
            bw.write("Min = " + min(masyvas));
            bw.newLine();
            bw.write("Max = " + max(masyvas));
            bw.newLine();
            bw.write("4. Reiksmes didesnes uz vidurki");
            bw.newLine();
            for (int i = 0; i < didesniSkaiciaiUzVidurki.length; i++) {
                bw.write(didesniSkaiciaiUzVidurki[i] + "");
            }
            bw.newLine();
            bw.write("5. Neigiami skaiciai");
            bw.newLine();
            for (int i = 0; i < neigiamiSkaiciai.length; i++) {
                bw.write(neigiamiSkaiciai[i] + "");
            }
            bw.newLine();
            bw.write("6. Pasikartojantys skaiciai");
            bw.newLine();
            for (int i = 0; i < pasikartojantysSkaiciai.length; i++) {
                bw.write("Pasikartojantys skaiciai " + pasikartojantysSkaiciai[i]);
                bw.newLine();
            }
            bw.write("7. Antras maziausias skaicius");
            bw.newLine();
//            bw.write("Antras maziausias skaicius " + masyvas[antrasMinIndeksas]);
//            bw.newLine();
//            bw.write("8. Antras didziausias skaicius");
//            bw.newLine();
//            bw.write("Antras didziausias skaicius " + masyvas[antrasMaxIndeksas]);
//            bw.newLine();
//            bw.write("9. Ar egzistuoja masyve skaicius 8.");
//            if (arEgzistuoja) {
//                bw.write("Skaičius 8 masyve egzistuoja");
//            } else {
//                bw.write("Skaicius 8 masyve neegzistuoja");
//            }
            bw.newLine();
            bw.write("10. Surikiuoti masyva ");
            bw.newLine();
            for (int i = 0; i < surikiuotasMasyvas.length; i++) {
                bw.write(surikiuotasMasyvas[i] + "");
            }


            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        return sum;
    }

    static double average(int[] array) {
        double average = sum(array) / array.length;

        return average;
    }

    static int min(int[] array) {
        int min = 99999999;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = -99999999;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int[] deleteSmallerThanAverage(int[] array) {
        int[] arrayBiggerThanAverage = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average(array)) {
                arrayBiggerThanAverage = pridetiElementa(arrayBiggerThanAverage, array[i]);
            }
        }
        return arrayBiggerThanAverage;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

    static int[] arrayNegativeElements(int[] array) {
        int[] arrayNegativeElements = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayNegativeElements = pridetiElementa(arrayNegativeElements, array[i]);
            }
        }
        return arrayNegativeElements;
    }

    static int[] sameElement(int[] array) {
        int[] sameElements = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    sameElements = pridetiElementa(sameElements, array[i]);

                }
            }
        }
        return sameElements;
    }

    static int secondMin(int[] array) {
        int min = 99999;
        int secondMin = 99999999;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (min < array[j] && secondMin > array[j]) {
                secondMin = array[j];
            }
        }
        return secondMin;
    }

    static void findNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("There is number " + number + " in array.");
                break;

            }
        }
    }

    static int[] sortedFromSmallestArray(int[] array) {
        int[] sortedFromSmallestArray = Arrays.copyOf(array, array.length);
        int temp = 0;
        for (int i = 0; i < sortedFromSmallestArray.length; i++) {
            for (int j = 0; j < sortedFromSmallestArray.length - 1; j++) {
                if (sortedFromSmallestArray[j] > sortedFromSmallestArray[j + 1]) {
                    temp = sortedFromSmallestArray[j];
                    sortedFromSmallestArray[j] = sortedFromSmallestArray[j + 1];
                    sortedFromSmallestArray[j + 1] = temp;

                }
            }
        }
        return sortedFromSmallestArray;
    }

    static void writeArray(int[] array) throws IOException, FileNotFoundException {
        BufferedWriter br = new BufferedWriter(new FileWriter("projektas/src/Java5/uzduotys/atsakymai.txt"));
        for (int i = 0; i < array.length; i++) {
            br.write(array[i] + "");
        }
       br.close();
    }
}


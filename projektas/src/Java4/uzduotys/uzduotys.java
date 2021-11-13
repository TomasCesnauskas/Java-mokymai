package Java4.uzduotys;

import java.io.*;
import java.util.Arrays;

public class uzduotys {
    public static void main(String[] args) {

        int[] masyvas = new int[0];
        int[] didesniSkaiciaiUzVidurki = new int[0];
        int[] neigiamiSkaiciai = new int[0];
        int[] pasikartojantysSkaiciai = new int[0];
        int[] surikiuotasMasyvas = new int[0];


        try {
            BufferedReader bf = new BufferedReader(new FileReader("projektas/src/Java4/uzduotys/duomenys.txt"));
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
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma = suma + masyvas[i];
        }
        double vidurkis = 1.0 * suma / masyvas.length;

        int minIndeksas = 0;
        int maxIndeksas = 0;
        for (int i = 1; i < masyvas.length; i++) {
            if (masyvas[minIndeksas] > masyvas[i]) {
                minIndeksas = i;
            }
            if (masyvas[maxIndeksas] < masyvas[i]) {
                maxIndeksas = i;
            }
        }

        for (int i = 1; i < masyvas.length; i++) {
            if (vidurkis < masyvas[i]) {
                didesniSkaiciaiUzVidurki = pridetiElementa(didesniSkaiciaiUzVidurki, masyvas[i]);

            }
            if (masyvas[i] < 0) {
                neigiamiSkaiciai = pridetiElementa(neigiamiSkaiciai, masyvas[i]);
            }
        }

        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] == masyvas[j]) {
                    pasikartojantysSkaiciai = pridetiElementa(pasikartojantysSkaiciai, masyvas[i]);
                    break;
                }

            }

        }

        int antrasMinIndeksas = 0;
        int antrasMaxIndeksas = 0;

        for (int i = 0; i < masyvas.length; i++) {

            if (masyvas[i] > masyvas[minIndeksas] && masyvas[i] < masyvas[antrasMinIndeksas]) {
                antrasMinIndeksas = i;
            }
            if (masyvas[i] < masyvas[maxIndeksas] && masyvas[i] > masyvas[antrasMaxIndeksas]) {
                antrasMaxIndeksas = i;
            }

        }

        boolean arEgzistuoja = false;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == 8) {
                arEgzistuoja = true;
                break;
            }
        }
        surikiuotasMasyvas = Arrays.copyOf(masyvas, masyvas.length);
        int laikinas;
        for (int i = 0; i < surikiuotasMasyvas.length; i++) {

            for (int j = 1; j < surikiuotasMasyvas.length - i; j++) {
                if (surikiuotasMasyvas[j - 1] > surikiuotasMasyvas[j]) {
                    laikinas = surikiuotasMasyvas[j - 1];
                    surikiuotasMasyvas[j - 1] = surikiuotasMasyvas[j];
                    surikiuotasMasyvas[j] = laikinas;
                }
            }
        }


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("projektas/src/Java4/uzduotys/atsakymai.txt"));

            bw.write("Nuskaityti duomenis");
            bw.newLine();
            for (int i = 0; i < masyvas.length; i++) {
                bw.write(masyvas[i] + "");
            }
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
            bw.write("Suma = " + suma);
            bw.newLine();
            bw.write("Vidurkis = " + vidurkis);
            bw.newLine();
            bw.write("3. Min ir Max");
            bw.newLine();
            bw.write("Min = " + masyvas[minIndeksas]);
            bw.newLine();
            bw.write("Max = " + masyvas[maxIndeksas]);
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
            bw.write("Antras maziausias skaicius " + masyvas[antrasMinIndeksas]);
            bw.newLine();
            bw.write("8. Antras didziausias skaicius");
            bw.newLine();
            bw.write("Antras didziausias skaicius " + masyvas[antrasMaxIndeksas]);
            bw.newLine();
            bw.write("9. Ar egzistuoja masyve skaicius 8.");
            if (arEgzistuoja) {
                bw.write("Skaičius 8 masyve egzistuoja");
            } else {
                bw.write("Skaicius 8 masyve neegzistuoja");
            }
            bw.newLine();
            bw.write("10. Surikiuoti masyva ");
            bw.newLine();
            for(int i= 0; i < surikiuotasMasyvas.length; i++){
                bw.write(surikiuotasMasyvas[i]+"");
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
}

package Java8.Figuros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Figuros {

    private Figura[] figuros;

    public Figuros() {
        this.figuros = new Figura[0];
    }

    public Figuros(Figura[] figuros) {
        this.figuros = figuros;
    }


    public Figura[] getFiguros() {
        return figuros;
    }

    public void setFiguros(Figura[] figuros) {
        this.figuros = figuros;
    }

    public void spausdinti() {
        for (int i = 0; i < figuros.length; i++) {
            System.out.println(figuros[i]);
        }
    }

    public void skaitytiFaila(String failoKelias) {
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));

            String line = br.readLine();
            while (line != null) {

                //kvadratas
                String[] reiksmes = line.split(" ");
                if (reiksmes.length == 1) {

                    double x = Double.parseDouble(reiksmes[0]);
                    Kvadratas a = new Kvadratas(x);
                    figuros = pridetiElementa(figuros, a);

                }//staciakampis
                else if (reiksmes.length == 2) {

                    double x = Double.parseDouble(reiksmes[0]);
                    double y = Double.parseDouble(reiksmes[1]);
                    Staciakampis a = new Staciakampis(x, y);
                    figuros = pridetiElementa(figuros, a);


                }//statusis trikampis
                else {
                    double x = Double.parseDouble(reiksmes[0]);
                    double y = Double.parseDouble(reiksmes[1]);
                    double z = Double.parseDouble(reiksmes[2]);
                    StatusisTrikampis a = new StatusisTrikampis(x, y, z);
                    figuros = pridetiElementa(figuros, a);
                }
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Figura[] pridetiElementa(Figura[] masyvas, Figura reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }

    public Figura didziausiasPlotas() {
        Figura didziausias = figuros[0];

        for (int i = 1; i < figuros.length; i++) {
            if (didziausias.plotas() < figuros[i].plotas()) {
                didziausias = figuros[i];
            }
        }
        return didziausias;
    }

    public Figura didziausiasPerimetras() {
        Figura didziausias = figuros[0];

        for (int i = 1; i < figuros.length; i++) {
            if (didziausias.perimetras() < figuros[i].perimetras()) {
                didziausias = figuros[i];
            }
        }
        return didziausias;
    }

    public Figura ilgiausiaKrastineGeresnis(){

        Figura didziausias = figuros[0];

        for(int i = 0; i < figuros.length;i++ ){
            if(didziausias.ilgiausiaKrastine() < figuros[i].ilgiausiaKrastine()){
                didziausias = figuros[i];
            }
        }
        return didziausias;
    }
}

package Java9.ManoFigura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Figuros {
    private Figura[] konteineris;

    public Figuros(Figura[] konteineris){
        this.konteineris = konteineris;
    }
    public Figuros(){
        this.konteineris = new Figura[0];
    }

    public void spausdintiMasyva(){
        for(Figura betkas: konteineris){
            System.out.println(betkas);
        }
    }
    public void readFile(String path){
        BufferedReader br;

        try{
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();


            while(line != null){
                String[] suskaldytaEilute = line.split(" ");
                if(suskaldytaEilute.length == 1){
                    double x = Integer.parseInt(suskaldytaEilute[0]);
                    Kvadratas kvadratas = new Kvadratas(x);
                    konteineris = pridetiElementa(konteineris,kvadratas);

                }else if(suskaldytaEilute.length == 2){
                    double x = Integer.parseInt(suskaldytaEilute[0]);
                    double y = Integer.parseInt(suskaldytaEilute[1]);
                    Staciakampis staciakampis = new Staciakampis(x,y);
                    konteineris = pridetiElementa(konteineris,staciakampis);

                }else if (suskaldytaEilute.length == 3){
                    double x = Integer.parseInt(suskaldytaEilute[0]);
                    double y = Integer.parseInt(suskaldytaEilute[1]);
                    double z = Integer.parseInt(suskaldytaEilute[2]);
                    StatusisTrikampis statusisTrikampis = new StatusisTrikampis(x,y,z);
                konteineris = pridetiElementa(konteineris,statusisTrikampis);

                }
                line = br.readLine();
            }
br.close();



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    static Figura[] pridetiElementa(Figura[] masyvas, Figura reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
    public Figura didziausiasPlotas(){
        Figura didziausiasPlotasFigura = konteineris[0];
        for(int i = 1; i < konteineris.length; i++){

            if(didziausiasPlotasFigura.plotas() < konteineris[i].plotas()){
                didziausiasPlotasFigura = konteineris[i];
            }
        }return didziausiasPlotasFigura ;
    }
    public Figura didziausiasPerimetras(){
        Figura didziausiasPerimetras = konteineris[0];
        for(int i = 1; i < konteineris.length; i++){
            if(didziausiasPerimetras.perimetras() < konteineris[i].perimetras()){
                didziausiasPerimetras = konteineris[i];
            }
        }

return didziausiasPerimetras;
        }

        public Figura ilgiausiaKrastine(){
        Figura ilgiausiaKrastine = konteineris[0];
            for(int i = 1; i < konteineris.length; i++) {
                if( ilgiausiaKrastine.ilgiausiaKrastine() < konteineris[i].ilgiausiaKrastine() ){
                    ilgiausiaKrastine = konteineris[i];
                }

            }
            return ilgiausiaKrastine;
        }
}

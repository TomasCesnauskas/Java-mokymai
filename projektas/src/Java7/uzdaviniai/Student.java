package Java7.uzdaviniai;

public class Student {

   private String vardas;
   private String pavarde;
   private String klase;
   private int[] pazymiuMasyvas;

   //Konstruktorius

    public Student (String vardas, String pavarde, String klase, int[] pazymiuMasyvas){
       this.vardas = vardas;
       this.pavarde = pavarde;
       this.klase = klase;
       this.pazymiuMasyvas = pazymiuMasyvas;
    }
   public String getVardas(){
        return vardas;
   }
        public void setVardas(String vardas){
            this.vardas = vardas;
       }
    public String getPavarde(){
        return pavarde;
    }
    public void setPavarde(String pavarde){
        this.pavarde = pavarde;
    }
    public String getKlase(){
        return klase;
    }
    public void setKlase(String klase){
        this.klase = klase;
    }
    public int[] getPazymiuMasyvas(){
        return pazymiuMasyvas;
    }
    public void setPazymiuMasyvas(int[] pazymiuMasyvas){
        this.pazymiuMasyvas = pazymiuMasyvas;
    }
   public String toString(){
        return "Vardas: " + vardas + " Pavarde: " + pavarde + " Klase: " + klase + " Pazymiu masyvas: " + pazymiuEilute() ;
   }
   private String pazymiuEilute(){
        String tekstas = "";
        for(int pazymys: pazymiuMasyvas){
            tekstas+= pazymys + " ";

        }
        return tekstas;
   }
public double average(){
        int sum = 0;
        for(int pazymys: pazymiuMasyvas){
            sum += pazymys;
        }
    Double average = 1.0*sum/ pazymiuMasyvas.length;
        return average;
}

}

package Java8.Suma;

public class Suma {
    private int pirmasSkaicius;
    private int antrasSkaicius;

//konstruktorius
    public Suma(int pirmasSkaicius, int antrasSkaicius){
        this.pirmasSkaicius = pirmasSkaicius;
        this.antrasSkaicius = antrasSkaicius;
    }
    public String toString(){
        return "Pirmas skaicius: " + pirmasSkaicius + " Antras skaicius " + antrasSkaicius + " Suma: "+ suma();
    }

private int suma(){
    int  suma =  pirmasSkaicius + antrasSkaicius;
    return suma;
}

}

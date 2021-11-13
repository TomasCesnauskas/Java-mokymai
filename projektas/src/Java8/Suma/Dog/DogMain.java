package Java8.Suma.Dog;

public class DogMain {
    public static void main(String[] args) {

        Dog dog = new Dog("Tobis", "Baltas",10);
        GermanShepard vokieciuAviganis = new GermanShepard("Reksas", "Juodas", 20);
        Labrador labradoras = new Labrador("Carlis","Geltonas",30);

        dog.bark();
        labradoras.bark();
        vokieciuAviganis.bark();
    }
}

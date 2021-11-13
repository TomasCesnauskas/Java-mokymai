package Java8.Suma.Animal;

public class FarmMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Sheep sheep = new Sheep();

        Animal[] gyvunai = {cat, chicken, cow, dog, sheep};

        Farm ferma = new Farm(gyvunai);
        System.out.println(ferma);
    }
}

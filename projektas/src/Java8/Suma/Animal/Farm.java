package Java8.Suma.Animal;

public class Farm {
    private Animal[] animals;

    public Farm(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String toString() {
        String bendras = "";
        for (int i = 0; i < animals.length; i++) {
            bendras += animals[i] + "\n";

        }
        return bendras;
    }
}

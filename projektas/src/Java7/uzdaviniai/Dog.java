package Java7.uzdaviniai;

public class Dog {

    private String breed;
    private int age;
    private String colour;


    //konstruktorius
    public Dog(String breed, int age, String colour) {
        this.breed = breed;
        this.age = age;
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBread(int bread) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void bark(){
        System.out.println("Bark");

    }
    public void sleep(){
        System.out.println("Sleep");

    }
    public String toString(){
        return " Breed: "+ breed + " Age: " + age + " Colour: "+ colour;
    }

}

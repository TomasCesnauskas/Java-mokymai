package Java7.uzdaviniai;

import java.sql.SQLOutput;

public class DogMain {
    public static void main(String[] args) {

        Dog pudelis = new Dog("pudelis", 2, "black");

        pudelis.bark();
        pudelis.sleep();
        System.out.println(pudelis);
        System.out.println(pudelis.getBreed());
        System.out.println(pudelis.getAge());
        System.out.println(pudelis.getColour());
    }



}

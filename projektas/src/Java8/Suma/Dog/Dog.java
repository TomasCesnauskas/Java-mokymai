package Java8.Suma.Dog;

public class Dog {
    private String name;
    private String color;
    private double weight;

    //konstruktorius

    public  Dog(String name,String color,double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
        public void setName(String name){
            this.name = name;
        }
        public String toString(){
        return "0";
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark(){
            System.out.println("Dog bark");
        }
    }


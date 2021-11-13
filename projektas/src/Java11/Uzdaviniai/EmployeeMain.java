package Java11.Uzdaviniai;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee darbuotojas1 = new Employee("Petras", 200,
                "Siauliai", "Vilniaus", "5");
        Employee darbuotojas2 = new Employee("Andrius", 500,
                "Vilnius", "Dvaro", "2");
        Employee darbuotojas3 = new Employee("Jonas", 1000,
                "Kaunas", "Pramones", "3");
        Employee darbuotojas4 = new Employee("Robertas", 300,
                "Klaipeda", "Vilniaus", "9");
        Employee darbuotojas5 = new Employee("Aloyzas", 600,
                "Panevezys", "Trumpoji", "8");
        Employee[] darbuotojai = {darbuotojas1, darbuotojas2, darbuotojas3, darbuotojas4, darbuotojas5};


//        System.out.println(darbuotojas.getAddress().getStreet());
//        System.out.println(darbuotojas.getAddress().getCity());
//        System.out.println(darbuotojas.getName());

//        increaseSalary(darbuotojai);
//        spausdinti(darbuotojai);

        Payment increaseTenPrecent = new Payment() {
            @Override
            public double increaseSalary(double salary) {
                return salary * 1.1;
            }
        };

        increaseSalary(darbuotojai,increaseTenPrecent);
        spausdinti(darbuotojai);

//        increaseSalary(darbuotojai, increaseHundredEuros);

        Payment increaseHundredEuros = new Payment() {
            @Override
            public double increaseSalary(double salary) {
                return salary + 100;
            }
        };

    }

    static void spausdinti(Employee[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i].getSalary());
        }
    }

    static void increaseSalary(Employee[] x) {

        double pekelimas = 50;

        for (int i = 0; i < x.length; i++) {
            double naujaAlga = x[i].getSalary() + pekelimas;
            x[i].setSalary(naujaAlga);


        }
    }

    static void increaseSalary(Employee[] x,Payment y) {


        for (int i = 0; i < x.length; i++) {
            double naujaAlga = y.increaseSalary(x[i].getSalary());
            x[i].setSalary(naujaAlga);


        }
    }
}

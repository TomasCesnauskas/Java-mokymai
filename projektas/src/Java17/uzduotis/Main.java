package Java17.uzduotis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee darbuotojas1 = new Employee("123", "Petras", "Petraitis",
                800d, "2020-10-11");
        Employee darbuotojas2 = new Employee("345", "Andrius", "Jonaitis",
                900d, "2020-09-11");
        Employee darbuotojas3 = new Employee("678", "Jonas", "Jonaitis",
                1200d, "2019-10-11");
        Employee darbuotojas4 = new Employee("901", "Darius", "Daraitis",
                800d, "2020-05-11");
        Employee darbuotojas5 = new Employee("234", "Deividas", "Deivauskas",
                800d, "2020-03-11");
        Employee darbuotojas6 = new Employee("123", "Petras", "Petraitis",
                800d, "2010-02-11");
        Employee darbuotojas7 = new Employee("345",  "Andrius", "Jonaitis",
                800d, "2015-01-11");
        Employee darbuotojas8 = new Employee("678", "Jonas", "Jonaitis",
                1600d, "2020-03-11");
        Employee darbuotojas9 = new Employee("901", "Darius", "Daraitis",
                800d, "2013-03-11");
        Employee darbuotojas10 = new Employee("234", "Deividas", "Deivauskas",
                500d, "2019-10-11");

//        List<Employee> darbuotojai = new ArrayList();
//        Collections.addAll(darbuotojai, darbuotojas1, darbuotojas2, darbuotojas3, darbuotojas4, darbuotojas5,
//                darbuotojas6, darbuotojas7, darbuotojas8, darbuotojas9, darbuotojas10);
//
//        System.out.println(darbuotojai);
//        Map<String, List<Employee>> grupuotiPagalAlga = darbuotojai.stream().collect(Collectors.groupingBy(Employee::getAsmensKodas, Collectors.summingDouble(x -> x
//                .getAlga().getIsmoketasAtlyginimas()))).entrySet().stream().sorted(comparingByValue());
//        System.out.println(grupuotiPagalAlga);
   }
}

package Java14.uzd2;

import Java14.uzd1.Saskaita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        String dataFilePath = "projektas/src/Java14/uzd2/duomenys.txt";
        ArrayList<Employee> employee = new ArrayList<>();
        readFile(dataFilePath, employee);
        System.out.println("Pradinis sarasas");
        System.out.println(employee);
        System.out.println("Surikiuotas sarasas");
        Collections.sort(employee);
        Collections.reverse(employee);
        System.out.println(employee);
        System.out.println("Daugiausiai uzdirbantis: ");
        Employee daugiausiaiUzdirbantis = daugiausiaiUzdirbantis(employee);
        System.out.println(daugiausiaiUzdirbantis);
        System.out.println("Uzdirba virš 1000 eur: ");
        ArrayList<Employee> geraiUzdirba = uzdirbaVirs1000(employee,1000);
        System.out.println(geraiUzdirba);

        System.out.println("Departmentu kiekis Map:");
        Integer countMap = departmentCountMap(employee);
        System.out.println(countMap);

        System.out.println("Departmentu kiekis Set:");
        Integer countSet = departmentCountSet(employee);
        System.out.println(countSet);


    }

    static void readFile(String path, ArrayList<Employee> x) {

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] reiksmes = line.split(" ");


                String name = reiksmes[0];
                String pavarde = reiksmes[1];
                String department = reiksmes[2];
                Double salary = Double.parseDouble(reiksmes[3]);

                Employee darbuotojas = new Employee(name, pavarde, department, salary);

                x.add(darbuotojas);

                line = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Employee daugiausiaiUzdirbantis(ArrayList<Employee> e) {
        Employee daugiausiaiUzdirbantis = e.get(0);
        if (e.size() == 0) {
            return null;
        }
        for (int i = 0; i < e.size(); i++) {
            if (daugiausiaiUzdirbantis.getSalary() < e.get(i).getSalary()) {
                daugiausiaiUzdirbantis = e.get(i);
            }
        }
        return daugiausiaiUzdirbantis;
    }

    static ArrayList uzdirbaVirs1000(ArrayList<Employee> e, double wantedSalary) {
        ArrayList<Employee> uzdirbaVirs1000 = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).getSalary() > wantedSalary) {
                uzdirbaVirs1000.add(e.get(i));

            }

        }
        return uzdirbaVirs1000;
    }

//    static int getDepartment(ArrayList<Employee> z) {
//        Map<String, Employee> map = new HashMap<>();
//        for (int i = 0; i < z.size(); i++) {
//
//            map.put(z.get(i).getDepartment(), z.get(i));
//        }
//        return map.size();
//    }

    static int departmentCountMap(ArrayList<Employee> q){

        Map<String,Employee> map = new HashMap<>();

        for(int i = 0; i < q.size(); i++){
            map.put(q.get(i).getDepartment(), q.get(i));
        }
        return map.size();
    }
    static Integer departmentCountSet(ArrayList<Employee> h){
        Set<String> departments = new HashSet<>();
        for(int i = 0; i < h.size(); i++){
            departments.add(h.get(i).getDepartment());
        }return departments.size();
    }

}
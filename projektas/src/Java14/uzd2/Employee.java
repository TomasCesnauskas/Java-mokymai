package Java14.uzd2;

public class Employee implements Comparable<Employee> {

    private String name;
    private String lastname;
    private String department;
    private Double salary;

    public Employee(String name, String lastname, String department, Double salary){
        this.name = name;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {

        if(o == null){
            return 1;
        }
        int result = name.compareTo(o.getName());
        if(result != 0){
            return result;
        }return lastname.compareTo(o.getLastname());
    }
}

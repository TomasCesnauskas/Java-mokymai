package Java7.uzdaviniai;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Jonas", "Jonaitis","1a", new int[]{8,7,9,5,7,8});
        Student student2 = new Student("Patras", "Petraitis","3a", new int[]{5,8,4,9,5,4});
        Student student3 = new Student("Juozas", "Juozaitis","5b", new int[]{6,3,5,4,1,2});
        Student student4 = new Student("Laimis", "Kazlauskas","2c", new int[]{8,7,4,5,8,5});



Student[] students = {student1,student2,student3,student4};
        System.out.println(student1);
        System.out.println(student1.average());
        System.out.println(bestStudent(students));
        spausdintiKlases(students);
    }
static Student bestStudent(Student[] students ){
       Student bestStudent = students[0];
       for(int i = 1; i < students.length; i++){
           if(students[i].average() > students[i-1].average()){
               bestStudent = students[i];
           }

       }
    return bestStudent;
}

    static void spausdintiKlases(Student[] x){
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i].getKlase());
        }
    }
}

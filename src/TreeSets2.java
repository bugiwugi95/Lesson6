import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSets2 {
    public static void main(String[] args) {
        Random id =  new Random();
        TreeSet<Student> treeSets = new TreeSet<>(new StudentComparator());
        treeSets.add(new Student("Alex", 5,id));
        treeSets.add(new Student("Vika", 4,id));
        treeSets.add(new Student("Roma", 3,id));
        treeSets.add(new Student("Homer",3,id ));
        treeSets.add(new Student("Bart", 2,id));
        System.out.println(treeSets);
    }

    static class Student {
        String name;
        int grade;
        Random idRandom;

        @Override
        public String toString() {
            return this.name + ":" + this.grade + "id student: " + this.idRandom.nextInt();
        }



        public Student(String name, int grade, Random idRandom) {
            this.name = name;
            this.grade = grade;
            this.idRandom = idRandom;
        }
    }

    static class StudentComparator implements Comparator<Student> {


        @Override
        public int compare(Student stu1, Student stu2) {
            return stu2.idRandom.nextInt(20) - stu1.idRandom.nextInt(50);
        }
    }
}

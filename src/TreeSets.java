import java.util.Comparator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Student> treeSets = new TreeSet<>(new StudentComparator());
        treeSets.add(new Student("Alex", 5));
        treeSets.add(new Student("Vika", 4));
        treeSets.add(new Student("Roma", 3));
        treeSets.add(new Student("Homer", 3));
        treeSets.add(new Student("Bart", 2));
        System.out.println(treeSets);
    }

    static class Student {
        String name;
        int grade;

        @Override
        public String toString() {
            return this.name + ":" + this.grade;
        }

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }


    }

    static class StudentComparator implements Comparator<Student> {


        @Override
        public int compare(Student stu1, Student stu2) {
            return stu2.grade - stu1.grade;
        }
    }
}

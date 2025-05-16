import java.text.Collator;
import java.util.Arrays;

class Student {

    String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.fullName);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            // student with acento
            new Student("José García"),
            new Student("Josí García"),
            new Student("Jose Gonzales"),
            new Student("Josue Gonzales"),
            new Student("Joseph Gonzales"),
        };
        // printStudents(students);
        // sort students by name
        // Arrays.sort(students, (a, b) -> a.fullName.compareTo(b.fullName));
        // printStudents(students);
        // sort with collator
        Collator collator = Collator.getInstance();
        Arrays.sort(students, (a, b) -> collator.compare(a.fullName, b.fullName)
        );
        printStudents(students);
    }
}

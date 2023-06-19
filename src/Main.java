import models.Student;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Map<String, Student> s = new HashMap<>();
            Student s1 = new Student("Aldo");
            Student s2 = new Student("Luca");
            Student s3 = new Student("Domenico");
            Student bestStudent = new Student();
            s.put("S1", s1);
            s.put("S2", s2);
            s.put("S3", s3);
            System.out.println(s1.getName());
            s1.addGrade(30);
            s1.addGrade(28);
            s1.addGrade(25);
            System.out.println(s1.getGrades());
            System.out.printf("Media voti: %.1f\n", s1.getAverageGrade());
            System.out.println(s2.getName());
            s2.addGrade(30);
            s2.addGrade(29);
            s2.addGrade(25);
            System.out.println(s2.getGrades());
            System.out.printf("Media voti: %.1f\n", s2.getAverageGrade());
            System.out.println(s3.getName());
            s3.addGrade(30);
            s3.addGrade(29);
            s3.addGrade(29);
            System.out.println(s3.getGrades());
            System.out.printf("Media voti: %.1f\n", s3.getAverageGrade());
            System.out.println(s);
            bestStudent= bestStudent.compareStudents(s);
            System.out.println("Lo studente con la miglior media è: " + bestStudent + ", Media: " + bestStudent.getAverageGrade());
    }
}
import com.example.mad314.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //SINGLETON PATTERN
    private static StudentRepository instance = null;
    private List<Student> students = new ArrayList<>();

    private StudentRepository() {
        Student student = new Student();
        student.usernameString = "pulkit";
        student.id=1;
        student.password="student1";
        this.students.add(student);

        student.usernameString ="viplove";
        student.id=2;
        student.password="student2";
        this.students.add(student);

        student.usernameString = "prasahnt";
        student.id=3;
        student.password="student3";
        this.students.add(student);

        student.usernameString = "prasahnt puri";
        student.id=4;
        student.password="student4";
        this.students.add(student);

        student.usernameString = "prasahnt kaushal";
        student.id=5;
        student.password="student5";
        this.students.add(student);

        student.usernameString = "voila";
        student.id=6;
        student.password="student6";
        this.students.add(student);

        student.usernameString = "rayan";
        student.id=7;
        student.password="student7";
        this.students.add(student);

        student.usernameString = "tony";
        student.id=8;
        student.password="student8";
        this.students.add(student);

        student.usernameString = "jack";
        student.id=9;
        student.password="student9";
        this.students.add(student);

        student.usernameString = "michael";
        student.id=10;
        student.password="student10";
        this.students.add(student);




    }


    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getAnimals() {
        return this.students;
    }
}



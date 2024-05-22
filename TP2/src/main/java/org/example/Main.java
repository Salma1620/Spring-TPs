package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean(StudentService.class);
        Student student1 = new Student(1, "Student", "one");
        studentService.createStudent(student1);
        Student retrievedStudent = studentService.findStudentById(1);
        if (retrievedStudent != null) {
            studentService.displayStudent(retrievedStudent);
            System.out.println("Student : " + retrievedStudent.getFirstName() + " " + retrievedStudent.getLastName() );
        } else {
            System.out.println("no student with this ID.");
        }
        context.close();
    }
}

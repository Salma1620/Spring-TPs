package org.example;

import org.example.Student;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayStudent(Student student);
}

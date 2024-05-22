package org.example.service.Impl;

import org.example.model.Student;
import org.example.service.StudentService;

public class StudentServiceMock implements StudentService {
    @Override
    public void createStudent(Student student) {
        System.out.println("create student mock : " + student);
    }

    @Override
    public Student findStudentById(int id) {
        System.out.println("searching or student with id : " + id);
        return null;
    }

    @Override
    public void displayStudent(Student student) {
        System.out.println("student mock : " + student);
    }
}

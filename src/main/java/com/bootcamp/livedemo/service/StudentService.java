package com.bootcamp.livedemo.service;

import com.bootcamp.livedemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentService {
    private List <Student> studentList = new ArrayList<>();

    public StudentService(){
        Student student1 = new Student();
        student1.setName("Branden");
        student1.setAge(33);
        Student student2 = new Student("Mariano", 28);
        Student student3 = new Student("Robert",30);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

    }

    public List<Student> getStudentList() {
        return studentList;
    }
}

package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {
     @GetMapping("/students")
    public List<Student> getStudents() {
        
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ram", 21));
        list.add(new Student(2, "Shyam", 22));
        list.add(new Student(3, "Sita", 20));
        list.add(new Student(4, "Geeta", 23));
        return list;
    
    }
}

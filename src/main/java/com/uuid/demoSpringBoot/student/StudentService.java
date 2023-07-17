package com.uuid.demoSpringBoot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "farhan",
                        "farhan@gmail.com",
                        LocalDate.now(),
                        30
                ),
                new Student(
                        "sohaib",
                        "sohaib@gmail.com",
                        LocalDate.now(),
                        28
                )
        );
    }
}

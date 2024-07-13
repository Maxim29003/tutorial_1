package com.maxim.Tutorial1.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {
    @Override
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Maxim",
                        "Anufriev",
                        LocalDate.now(),
                        "maxim@gmail.com",
                        21
                ),
                new Student(
                        "Maxim",
                        "Anufriev",
                        LocalDate.now(),
                        "maxim@gmail.com",
                        21
                )
        );
    }
}

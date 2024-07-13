package com.maxim.Tutorial1.student;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents();
}

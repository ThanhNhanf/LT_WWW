package com.example.student_crud.service;

import com.example.student_crud.model.Student;
import com.example.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAll() { return repository.findAll(); }

    public void save(Student student) { repository.save(student); }

    public void delete(Integer id) { repository.deleteById(id); }

    public Student getById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
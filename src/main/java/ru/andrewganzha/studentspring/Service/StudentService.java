package ru.andrewganzha.studentspring.Service;

import org.springframework.stereotype.Service;
import ru.andrewganzha.studentspring.model.Student;

import java.util.List;

@Service
public interface StudentService {
  List<Student> findAllStudent();
  Student saveStudent(Student student);
  Student findByEmail(String email);
  Student updateStudent(Student student);

  void deleteStudent(String email);
 }

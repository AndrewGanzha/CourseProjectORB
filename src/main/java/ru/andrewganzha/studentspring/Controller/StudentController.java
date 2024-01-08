package ru.andrewganzha.studentspring.Controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.andrewganzha.studentspring.Service.StudentService;
import ru.andrewganzha.studentspring.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    @Qualifier("inMemoryStudentServiceImpl")
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        //todo
        return service.findAllStudent();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Студент успешно сохранен";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @GetMapping("update_student")
    public Student updateStudent(Student student) {
        return service.updateStudent(student);
    }

    @GetMapping("delete_student/{email}")
    public void deleteStudent(String email) {
        service.deleteStudent(email);
    }
}

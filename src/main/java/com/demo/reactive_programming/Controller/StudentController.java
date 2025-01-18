package com.demo.reactive_programming.Controller;

import com.demo.reactive_programming.Model.Student;
import com.demo.reactive_programming.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Mono<Student> save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public Flux<Student> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> getById(@PathVariable int id) {
        return studentService.findById(String.valueOf(id));
    }

    @PutMapping("/{id}")
    public Mono<Student> update(@PathVariable int id, @RequestBody Student student) {
        // Ensure the ID in the request path is set in the student object
        student.setId(id);
        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable int id) {
        return studentService.deleteById(String.valueOf(id));
    }

}

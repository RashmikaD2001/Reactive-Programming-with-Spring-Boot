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
    Mono<Student> save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    Flux<Student> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> getById(@PathVariable int id) {
        return studentService.findById(String.valueOf(id));
    }

}

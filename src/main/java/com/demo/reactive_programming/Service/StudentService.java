package com.demo.reactive_programming.Service;

import com.demo.reactive_programming.Model.Student;
import com.demo.reactive_programming.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Mono<Student> save(Student student) {
        return studentRepository.save(student);
    }

    public Flux<Student> findAll() {
        return studentRepository.findAll().delayElements(Duration.ofSeconds(2));
    }

    public Mono<Student> findById(String id) {
        return studentRepository.findById(Integer.valueOf(id));
    }

    public Mono<Void> deleteById(String id) {
        return studentRepository.deleteById(Integer.valueOf(id));
    }
}

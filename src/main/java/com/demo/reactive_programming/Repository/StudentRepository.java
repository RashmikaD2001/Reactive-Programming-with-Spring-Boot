package com.demo.reactive_programming.Repository;

import com.demo.reactive_programming.Model.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

    Flux<Student> findAllByFnameIgnoreCase(String name);
}

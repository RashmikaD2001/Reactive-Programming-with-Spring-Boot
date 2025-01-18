package com.demo.reactive_programming;

import com.demo.reactive_programming.Model.Student;
import com.demo.reactive_programming.Service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveProgrammingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentService service) {
		return args -> {
			for (int i = 0;i < 10;i++){
				service.save(Student.builder()
						.fname("R"+i)
						.lname("D"+i)
						.age(i)
						.build()
				).subscribe();
			}
		};
	}
}

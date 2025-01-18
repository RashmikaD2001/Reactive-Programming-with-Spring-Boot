package com.demo.reactive_programming.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("students")
public class Student {

    @Id
    private Integer id;
    private String fname;
    private String lname;
    private int age;
}

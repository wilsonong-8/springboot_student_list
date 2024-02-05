package com.example.SpringTutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam_jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student Wilson = new Student(
                    2L,
                    "Wilson",
                    "wilson_ong@gmail.com",
                    LocalDate.of(1999,Month.FEBRUARY,2)
            );
            studentRepository.saveAll(
                    List.of(mariam,Wilson)
            );
        };
    }
}

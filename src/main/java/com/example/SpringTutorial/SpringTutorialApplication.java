package com.example.SpringTutorial;

import com.example.SpringTutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam_jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY,5),
						21
				),
				new Student(
						2L,
						"Wilson",
						"wilson_ong@gmail.com",
						LocalDate.of(1999,Month.FEBRUARY,2),
						30
				)
		);
	}
}

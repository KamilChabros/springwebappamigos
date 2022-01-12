package xyz.springbootamigos.springwebappamigos.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student kamil = new Student(
                    1L,
                    "Kamil",
                    "kamil@wp.pl",
                    LocalDate.of(1987, Month.JULY, 17)
            );

            Student jacek = new Student(
                    "Jacek",
                    "jacek@wp.pl",
                    LocalDate.of(1991, Month.APRIL, 21)
            );

            studentRepository.saveAll(
                    List.of(kamil, jacek)
            );

        };
    }

}

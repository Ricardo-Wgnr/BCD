package br.edu.ifsc.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(EmpregadoRepository repositorio) {
        return (args -> {
//            insertDataEmpregado(repositorio);
//            System.out.println(repositorio.findAll());
            System.out.println(repositorio.findEmpregadoBySobrenomeContaining("Wagner"));
        });

    }

    private void insertDataEmpregado(EmpregadoRepository repositorio) {
        repositorio.save(new Empregado("Ricardo", "Wagner"));
        repositorio.save(new Empregado("Gabriel", "Kuster"));
        repositorio.save(new Empregado("Ramon", "Hugo"));
        repositorio.save(new Empregado("Luiza", "Kuze"));
    }
}

package br.edu.ifsc.responsavel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResponsavelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResponsavelApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner (ResponsavelJovemRepository repository) {
        return args -> {
            System.out.println(repository.findAll());
        };
    }

}

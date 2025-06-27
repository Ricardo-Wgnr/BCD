package br.edu.ifsc.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpregadoRepository extends CrudRepository<Empregado, Long> {

    List<Empregado> findEmpregadoBySobrenomeContaining(String sobrenome);

}

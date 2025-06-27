package br.edu.ifsc.responsavel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Jovem {
    @Id
    private String cpf;
    @OneToOne
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Jovem{" +
                "cpf='" + cpf + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}

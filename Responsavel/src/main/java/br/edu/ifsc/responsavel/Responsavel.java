package br.edu.ifsc.responsavel;

import jakarta.persistence.*;

@Entity
public class Responsavel {
    @Id
    private String cpf;
    @Column
    private String parentesco;
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
        return "Responsavel{" +
                "cpf='" + cpf + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}

package br.edu.ifsc.responsavel;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pessoa {
    @Id
    private String cpf;
    @Column
    private String nome;
    @Column(name = "endereco")
    private String endereço;
    @Column(name="DataNasc")
    private Date dataNascimento;
    @ManyToOne
    @JoinColumn(name = "idContato", referencedColumnName = "idContato")
    private Contato contato;

    public Pessoa() {

    }

    public Pessoa(String cpf, String nome, String endereço, Date dataNascimento, Long idContato, Contato contato) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", contato=" + contato +
                '}';
    }
}

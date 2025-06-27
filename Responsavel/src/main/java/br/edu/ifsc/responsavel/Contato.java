package br.edu.ifsc.responsavel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Contato {

    @Id
    @GeneratedValue
    private Long idContato;
    @Column
    private String telefone;
    @Column
    private String email;

    public Contato() {
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }

    public Long getIdContato() {
        return idContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "idContato=" + idContato +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package br.edu.ifsc.responsavel;

import jakarta.persistence.*;

import java.io.Serializable;

class CompositeKey implements Serializable {
    private String cpfResponsavel;
    private String cpfJovem;
}

@Entity
@IdClass(CompositeKey.class)
@Table(name = "Responsavel_Jovem")
public class ResponsavelJovem {
    @Id
    private String cpfResponsavel;
    @Id
    private String cpfJovem;
    @OneToOne
    @JoinColumn(name = "cpfResponsavel", referencedColumnName = "cpf")
    private Responsavel responsavel;

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }


    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getCpfJovem() {
        return cpfJovem;
    }

    public void setCpfJovem(String cpfJovem) {
        this.cpfJovem = cpfJovem;
    }

    @Override
    public String toString() {
        return "ResponsavelJovem{" +
                "cpfResponsavel='" + cpfResponsavel + '\'' +
                ", cpfJovem='" + cpfJovem + '\'' +
                ", responsavel=" + responsavel +
                '}';
    }
}

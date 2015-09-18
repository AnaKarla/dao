
package br.edu.impacta.ads.lp3.empresa.model;


import java.io.Serializable;


public class Departamento implements Serializable {

    private Integer codico;
    private String nome;

    public Departamento() {
    }

    public Integer getCodico() {
        return codico;
    }

    public void setCodico(Integer codico) {
        this.codico = codico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

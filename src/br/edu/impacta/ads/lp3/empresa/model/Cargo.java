package br.edu.impacta.ads.lp3.empresa.model;


import java.io.Serializable;


public class Cargo implements Serializable {

    private Integer codico;
    private String nome;

    public Cargo() {
    }

    public Cargo(Integer codico, String nome) {
        this.codico = codico;
        this.nome = nome;
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

    public void setCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


package br.edu.impacta.ads.lp3.empresa.model;


import br.edu.impacta.ads.lp3.empresa.model.Departamento;
import java.io.Serializable;
import java.util.Date;


public class Funcionario implements Serializable {

    private Integer codigo;
    private String nome;
    private Date contratacao;
    private Departamento departamento;
    private Cargo cargo;

    
    
    

    public Departamento getDepartamente() {
        return departamento;
    }


public Funcionario() {
    }

    public Integer getCodico() {
        return codigo;
    }

    public void setCodico(Integer codico) {
        this.codigo = codico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setContratacao(Date dateContratacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setContratacao(br.edu.impacta.ads.lp3.empresa.dao.jdbc.Date dateContratacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

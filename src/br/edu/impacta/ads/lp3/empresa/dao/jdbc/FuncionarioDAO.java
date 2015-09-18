
package br.edu.impacta.ads.lp3.empresa.dao.jdbc;


import br.edu.impacta.ads.lp3.empresa.model.Cargo;
import br.edu.impacta.ads.lp3.empresa.model.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO extends Object implements GenericoDAO<Funcionario> {

    @Override
    public void inserir(Funcionario e) {
       Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            
            ,,,,,,
            
            
    }

    @Override
    public void remover(Funcionario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Funcionario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listar() {
        List<Funcionario> funcionarios = new ArrayList<>();

        String sql = "SELECT F.ID_FUNCIONARIO, F.NOME, F.DT_CONTRATACAO"
                + "       C.ID_CARGO, C.NOME CARGO, D.ID_DEPARTAMENTO, D.NOME"
                + " FROM EMPRESA.FUNCIONARIO  F "
                + " INNER JOIN EMPRESA.CARGO  C "
                + " ON F.ID_CARGO = C.ID_CARGO "
                + " INNER JOIN EMPRESA. DEPARTAMENTO D "
                + " ON F.ID_DEPARTAMENTO = D. ID_DEPARTAMENTO";

        try {

            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodico(result.getInt("ID_FUNCIONARIO"));
                funcionario.setNome(result.getString("NOME"));
                java.sql.Date date = result.getDate("DT_CONTRATACAO");
                Date dateContratacao = new Date(date.getTime());
                funcionario.setContratacao(dateContratacao);

                Cargo cargo = new Cargo();
                cargo.setCodigo();

            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funcionarios;
    }

}

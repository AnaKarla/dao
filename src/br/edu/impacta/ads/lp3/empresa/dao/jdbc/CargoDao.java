package br.edu.impacta.ads.lp3.empresa.dao.jdbc;

import br.edu.impacta.ads.lp3.empresa.model.Cargo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CargoDao implements GenericoDAO<Cargo> {

    @Override
    public void inserir(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cargo> listar() {
        List<Cargo> cargos = new ArrayList<Cargo>();
        try {

            Connection connection = Conexao.getInstance().getConnection();
            java.sql.Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM EMPRESA.CARGO");//resul
            while (result.next()) {
                Cargo cargo = new Cargo();
                cargo.setCodico(result.getInt("id_CARGO"));
                cargo.setNome(result.getString("NOME"));
                cargos.add(cargo);

            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CargoDao.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(CargoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargos;
    }

}

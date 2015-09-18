package br.edu.impacta.ads.lp3.empresa.dao.jdbc;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao implements Serializable {

    private static Conexao conexao;

   
    private Conexao() {

    }

    public static Conexao getInstance() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {

            Class.forName("org.apache.derby.jdbc.ClienteDirver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Empresa", "fit", "fit");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;

    }

}

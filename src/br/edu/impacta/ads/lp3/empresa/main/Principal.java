package br.edu.impacta.ads.lp3.empresa.main;

import br.edu.impacta.ads.lp3.empresa.model.Cargo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        List<Cargo> cargos = new ArrayList<Cargo>();

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection connection = DriverManager.getConnection("jdbc:derby://127.0.0.1:1527/Empresa", "fit", "fit"); //Empresa é nome do banco,fit é o usuário,fit é a senha
        java.sql.Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM EMPRESA.CARGO");//resul
        while (result.next()) {
            Cargo cargo = new Cargo();
            cargo.setCodico(result.getInt("id_CARGO"));
            cargo.setNome(result.getString("NOME"));
            cargos.add(cargo);

        }
        connection.close();

        for (Cargo cargo : cargos) {
            System.out.println(cargo.getCodico() + "" + cargo.getNome());
        }
    }

}

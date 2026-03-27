package org.example.agenda.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class ContatoDAO {
    private final String driver = "org.postgresql.Driver";// Driver Postgres
    private final String url = "jdbc:postgresql://localhost:5432/dbagenda"; // meu banco
    private final String user = "postgres"; // meu user postgres
    private final String pass = "17011998"; // minha senha do postgres

    // metodo para conexao

    // estou utilizando o metodo da class Connection
    public Connection getConnection(){
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro de Conexao " + e.getMessage());
        }
    }

    public void salvar(Contato contato) throws SQLException {
        String sql = "INSERT INTO contatos (nome, contato, local) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getContato());
            stmt.setString(3, contato.getLocal());

            stmt.executeUpdate();
            System.out.println("Contato salvo com sucesso");

        }catch (SQLException e){
            throw new RuntimeException("Erro ao salvar contato " + e.getMessage());
        }
    }

}

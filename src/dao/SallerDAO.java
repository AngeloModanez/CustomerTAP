package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DatabaseConnection;
import entity.Saller;

public class SallerDAO {
    private Connection conn;

    public SallerDAO() throws SQLException {
        this.conn = DatabaseConnection.getConnection();
    }

    public void insert(Saller sallers) {
        String sql = "INSERT INTO Saller(sallers) VALUES (?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sallers.getSaller());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
    }
}

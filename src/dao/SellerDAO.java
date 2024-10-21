package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DatabaseConnection;
import entity.Seller;

public class SellerDAO {
    private Connection conn;

    public SellerDAO() throws SQLException {
        this.conn = DatabaseConnection.getConnection();
    }

    public void insert(Seller sellers) {
        String sql = "INSERT INTO Seller(sellers) VALUES (?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sellers.getSeller());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
    }
}

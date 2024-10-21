package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DatabaseConnection;
import entity.Sale;

public class SaleDAO {
    private Connection conn;

    public SaleDAO() throws SQLException {
        this.conn = DatabaseConnection.getConnection();
    }

    public void insert(Sale sales) {
        String sql = "INSERT INTO Sale(sales) VALUES (?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sales.getDate());
            stmt.setFloat(2, sales.getTotal());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
    }
}

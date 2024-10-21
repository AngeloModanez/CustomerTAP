package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DatabaseConnection;
import entity.SaleItem;

public class SaleItemDAO {
    private Connection conn;

    public SaleItemDAO() throws SQLException {
        this.conn = DatabaseConnection.getConnection();
    }

    public void insert(SaleItem salesItems) {
        String sql = "INSERT INTO SalesItems(salesItems) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, salesItems.getQuantity());
            stmt.setFloat(2, salesItems.getUnitValue());
            stmt.setFloat(3, salesItems.getTotalValue());
            stmt.setFloat(4, salesItems.getDiscount());
            stmt.setFloat(5, salesItems.getTotalDiscount());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir item de vendas: " + e.getMessage());
        }
    }
}

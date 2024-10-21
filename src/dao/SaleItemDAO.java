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

    public void insert(SaleItem salesItens) {
        String sql = "INSERT INTO SaleItem(salesItens) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, salesItens.getQuantity());
            stmt.setFloat(2, salesItens.getUnitValue());
            stmt.setFloat(3, salesItens.getTotalValue());
            stmt.setFloat(4, salesItens.getDiscount());
            stmt.setFloat(5, salesItens.getTotalDiscount());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir item de vendas: " + e.getMessage());
        }
    }
}

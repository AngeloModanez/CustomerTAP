package dao;

import connection.DatabaseConnection;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO {
    public void insert(Product products) {
        String sql = "INSERT INTO Product(products) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, products.getSKU());
            stmt.setString(2, products.getProduct());
            stmt.setFloat(3, products.getPrice());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
    }
}

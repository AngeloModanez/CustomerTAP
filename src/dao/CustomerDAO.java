package dao;

import connection.DatabaseConnection;
import entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO {
    public void insert(Customer customers) {
        String sql = "INSERT INTO customers(customers) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, customers.getCustomer());
            stmt.setString(2, customers.getState());
            stmt.setString(3, customers.getGender().name());
            stmt.setString(4, customers.getStatus());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
    }
}
package dao;

import connection.DatabaseConnection;
import entity.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CustomerDAO {
    private Connection conn;

    public CustomerDAO() throws SQLException {
        this.conn = DatabaseConnection.getConnection();
    }

    public void insert(Customer customers) {
        String sql = "INSERT INTO Customer(customers) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, customers.getCustomer());
            stmt.setString(2, customers.getState());
            stmt.setString(3, customers.getGender().name());
            stmt.setString(4, customers.getStatus());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }
}

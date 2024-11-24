package JDBC_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class QuocTestDB {
    public static void main(String[] args) {
        // URL kết nối đến cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/library"; // Địa chỉ cơ sở dữ liệu
        String user = "quoc"; // Tài khoản MySQL
        String password = "123456"; // Mật khẩu MySQL

        // Kết nối đến cơ sở dữ liệu
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Kết nối cơ sở dữ liệu thành công!");
        } catch (SQLException e) {
            System.out.println("Kết nối cơ sở dữ liệu thất bại!");
            e.printStackTrace();
        }
    }
}


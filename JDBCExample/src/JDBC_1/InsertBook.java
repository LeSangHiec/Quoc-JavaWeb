package JDBC_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBook {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "quoc";
        String password = "123456";

        String insertQuery = "INSERT INTO books (title, author, published_year) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
            pstmt.setString(1, "The Catcher in the Rye");
            pstmt.setString(2, "J.D. Salinger");
            pstmt.setInt(3, 1951);

            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Số bản ghi được thêm: " + rowsInserted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    


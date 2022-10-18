package JDBC.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Example8 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silmek istediğiniz Kullanıcının ID bilgisini yazınız : ");
        int userId = scanner.nextInt();
        Connection connection = null;
        String deleteQuery = "Delete from student where student_id = ?";
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement prSt = connection.prepareStatement(deleteQuery);
            prSt.setInt(1,userId);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

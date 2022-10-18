package JDBC.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example2 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connection = null;
        String prSql = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement prSt = connection.prepareStatement(prSql);
            prSt.setString(1,"Muhittin3");
            prSt.setInt(2,11);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

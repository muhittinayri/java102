package JDBC.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example1 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";
    public static void main(String[] args) {
        Connection conn = null;
        String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        try {
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement prSt = conn.prepareStatement(prSql);
            prSt.setString(1,"Muhittin2");
            prSt.setInt(2,12);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

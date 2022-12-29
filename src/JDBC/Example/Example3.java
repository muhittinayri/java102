package JDBC.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example3 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connection = null;
        String prSql = "UPDATE student SET student_name = ? WHERE student_id = ?";
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement prSt = connection.prepareStatement(prSql);
            prSt.setString(1,"Muhittin Update1");
            prSt.setInt(2,7);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

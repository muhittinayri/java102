package JDBC;

import java.sql.*;

public class DBUpdateTwo {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connect = null;
        String stSql = "UPDATE student SET student_name='Adem TOPAL' WHERE student_id = 7";
        String prSql = "UPDATE student SET student_name=? WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setString(1,"Adil Topal");
            pr.setInt(2,5);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

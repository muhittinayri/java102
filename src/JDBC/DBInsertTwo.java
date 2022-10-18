package JDBC;

import java.sql.*;

public class DBInsertTwo {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connect = null;
        String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Gönül AYRI',5)";
        String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setString(1,"Furkan AYRI");
            prSt.setInt(2,9);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

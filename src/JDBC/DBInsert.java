package JDBC;

import java.sql.*;

public class DBInsert {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connect = null;
        String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Gönül AYRI',5)";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();;
            System.out.println(st.executeUpdate(insertSql));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

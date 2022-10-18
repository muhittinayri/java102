package JDBC;

import java.sql.*;

public class DBDelete {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connect = null;
        String stSql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();
            st.executeUpdate(stSql);

            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,3);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

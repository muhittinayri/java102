package JDBC;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM student";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet data = st.executeQuery(sql);

            /*
            data.next();
            data.next();
            data.first();
            data.last();

            data.absolute(2);
            System.out.println(data.getString("student_name"));
            */

            while (data.next()){
                System.out.println("ID : " + data.getInt("student_id"));
                System.out.println("Name : " + data.getString("student_name"));
                System.out.println("Sınıfı : " + data.getInt("student_class"));
                System.out.println("****************");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

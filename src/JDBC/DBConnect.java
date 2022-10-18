package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        Connection connection = null;
        String url = "jdbc:mysql://localhost/university?user=muhittin&password=muhittin";
        try {
            connection = DriverManager.getConnection(url);
        }catch (SQLException e){
            e.getMessage();
        }
    }
}

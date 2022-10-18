package JDBC.Example;

import java.sql.*;
import java.util.Scanner;

public class Example5 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("İstemiş Olduğunuz Kullanıcının ID bilgisini giriniz : ");
        int userId = scanner.nextInt();
        Connection connection = null;
        String sql = "SELECT * FROM student where student_id = ('" + userId + "')";

        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                System.out.println("ID : " + data.getInt("student_id"));
                System.out.println("Name : " + data.getString("student_name"));
                System.out.println("Sınıfı : " + data.getInt("student_class"));
                System.out.println("*****************");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

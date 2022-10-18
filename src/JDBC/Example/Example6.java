package JDBC.Example;

import java.sql.*;
import java.util.Scanner;

public class Example6 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Connection connection = null;
        System.out.print("Lütfen Arama Yapmak İstediğiniz Kullanıcının Adını Giriniz : ");
        String userName = scanner.nextLine();
        String sql = "SELECT * FROM student WHERE student_name = ('" + userName + "')";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet data = statement.executeQuery(sql);
            while (data.next()){
                System.out.println("ID : " + data.getInt("student_id"));
                System.out.println("User Name : " + data.getString("student_name"));
                System.out.println("User Class No : " + data.getInt("student_class"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

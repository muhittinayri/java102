package JDBC.Example;

import java.sql.*;
import java.util.Scanner;

public class Example7 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";

    public static void main(String[] args) {
        Connection connection = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcının ID Bilgisini giriniz : ");
        int userID = scanner.nextInt();
        System.out.print("Kullanıcının İsim Bilgisini giriniz : ");
        String userName = scanner.next();


        String prSql = "UPDATE student SET student_name = ? WHERE student_id = ?";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement prSt = connection.prepareStatement(prSql);
            prSt.setString(1,userName);
            prSt.setInt(2,userID);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

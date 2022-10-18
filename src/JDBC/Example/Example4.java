package JDBC.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example4 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "muhittin";
    public static final String DB_PASSWORD = "muhittin";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz : ");
        String name = scanner.nextLine();
        System.out.print("Lütfen Kaçıncı Sınıfta Olduğunuzu Giriniz : ");
        int classNo = scanner.nextInt();

        String stSql = "insert into student (student_name,student_class) values('" + name + "','" + classNo + "')";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connection.createStatement();
            st.executeUpdate(stSql);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

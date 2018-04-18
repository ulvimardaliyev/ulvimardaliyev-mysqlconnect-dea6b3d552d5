package task;

import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




        try  {
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webapp", "root", "ulvi291");
            Statement statement = connection.createStatement();

            System.out.println("please enter an id number");
            int id = scanner.nextInt();
            System.out.println("please enter your last name");
            String last_name = scanner.next();
            System.out.println("please enter your first name");
            String first_name = scanner.next();
            System.out.println("please enter your email");
            String email = scanner.next();


            String sql = "insert into users"
                    + "(id, last_name, first_name, email)"
                    + " values ('" + id + "','" + last_name + "','" + first_name + "','" + email + "')";
            statement.executeUpdate(sql);
            System.out.println("Connected");
            System.out.println("last id number: " + id);


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

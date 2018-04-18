package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AdditionalClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Connection connection = null;

        Statement statement;

        //mysql connection elements and sql statement to execute
        String url, username, password, sql;

        username = "root";

        password = "ulvi291";

        url = "jdbc:mysql://127.0.0.1:3306/webapp";

        System.out.println("please enter an id number");
        int id = scanner.nextInt();

        System.out.println("please enter your last name");
        String last_name = scanner.next();

        System.out.println("please enter your first name");
        String first_name = scanner.next();

        System.out.println("please enter your email");
        String email = scanner.next();

        //
        sql = "insert into users"
                + "(id, last_name, first_name, email)"
                + " values ('" + id + "','" + last_name + "','" + first_name + "','" + email + "')";

        try  {
            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();

            statement.executeUpdate(sql);

            System.out.println("Connected");

        } catch (Exception e) {

            System.out.println(e);

        } finally {
            System.out.println("Done");
        }

    }
}

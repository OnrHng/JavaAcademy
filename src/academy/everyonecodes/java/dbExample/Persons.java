package academy.everyonecodes.java.dbExample;
import java.sql.*;
/*
    We will use persons table which is created for exercise 3
    and also use ECClassroom DB
*/

public class Persons {
    private Connection connection = null;

    public Persons() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Setup the connection with the DB
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost/<databaseName>?" +
                        "user=<username>&password=<password>&serverTimezone=UTC");
    }

    public void showAllPersons() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from persons order by personId");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("personId") + " | " + resultSet.getString("firstname") + " | "
                    + resultSet.getString("lastname") + " | " + resultSet.getString("fullname"));
        }
    }

    public static void main(String []args) throws Exception {
        Persons persons = new Persons();
        persons.showAllPersons();
    }
}

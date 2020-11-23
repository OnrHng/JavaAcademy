package academy.everyonecodes.java.dbExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
// You first need to create this table to run the example!
create table users (
  id int primary key auto_increment,
  uname varchar(20) not null unique,
  email varchar(255) not null unique
);
*/

public class MySQLAccess {
    private Connection connection = null;

    public MySQLAccess() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Setup the connection with the DB
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost/<databaseName>?" +
                        "user=<username>&password=<password>&serverTimezone=UTC");
    }

    public void readUsers() throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select id,uname,email from users order by id");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " | " + resultSet.getString("uname") + " | "
                    + resultSet.getString("email"));
        }
    }

    public int insertUser() throws SQLException {
        PreparedStatement preparedStatement = connection
                .prepareStatement("insert into  users (uname, email) values(?, ?)",
                        Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, "Sally");
        preparedStatement.setString(2, "sally@gmail.com");
        int affectedRows = preparedStatement.executeUpdate();
        System.out.println(affectedRows + " rows inserted!");
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        int lastInsertedId = -1;
        while (resultSet.next()) {
            lastInsertedId = resultSet.getInt(1);
            System.out.println("inserted id: " + lastInsertedId);
        }
        return lastInsertedId;
    }

    public void updateUser(int userId, String newUname) throws SQLException {
        PreparedStatement preparedStatement = connection
                .prepareStatement("update users set uname = ? where id = ?");
        preparedStatement.setString(1, newUname);
        preparedStatement.setInt(2, userId);
        int affectedRows = preparedStatement.executeUpdate();
        System.out.println(affectedRows + " rows updated!");
    }

    public static void main(String []args) throws Exception {
        MySQLAccess ma = new MySQLAccess();
        ma.readUsers();
        int insertedId = ma.insertUser();
        ma.updateUser(insertedId, "Micha");
        ma.readUsers();
    }
}

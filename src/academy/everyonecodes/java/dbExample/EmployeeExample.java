package academy.everyonecodes.java.dbExample;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.nio.file.Path;
import java.sql.*;
import java.util.List;

public class EmployeeExample {
    private Connection connection = null;

    public EmployeeExample() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Setup the connection with the DB
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost/<databaseName>?" +
                        "user=<username>&password=<password>&serverTimezone=UTC");
    }

    public void readEmployee() throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select employeenr,name,salary, department from employees order by employeenr");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("employeenr") + " | " + resultSet.getString("name") + " | "
                    + resultSet.getInt("salary") + " | " + resultSet.getString("department"));
        }
    }

    public void insertEmployee() throws SQLException {
//      buraya csv file oku onu bir liste icine at , ilk ogesini sil ve db ye ekle
        FileReader reader = new FileReader();
        Path path = Path.of("src/academy/everyonecodes/java/dbExample/employees.csv");
        List<String> lines = reader.read(path);
        lines.remove(0); // delete ilk line

        PreparedStatement preparedStatement = null;
        int affectedRows = 0;
        for (String line : lines) {
            String[] parsedLine = line.split(",");

            preparedStatement = connection
                    .prepareStatement("insert into  employees (employeenr, name, salary, department) values(?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, Integer.parseInt(parsedLine[0]));
            preparedStatement.setString(2, parsedLine[1]);
            preparedStatement.setInt(3, Integer.parseInt(parsedLine[2]));
            preparedStatement.setString(4, parsedLine[3]);

            preparedStatement.executeUpdate();
            affectedRows++;
        }

        System.out.println(affectedRows + " rows inserted!");
    }

    public void  dropTable() throws SQLException {
        String dropTable = "DROP TABLE employees ";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(dropTable);
            System.out.println("Employees table  deleted...");
        } catch (SQLException e) {
            System.out.println("Error on drop table!");
            e.printStackTrace();
        }
    }

    public void  createTable() throws SQLException {
        String myTableName = "CREATE TABLE employees ("
                + "employeenr int primary key not null,"
                + "name varchar(20) not null unique,"
                + "salary int not null,"
                + "department varchar(32) not null);";
        try {
            Statement statement = connection.createStatement();
            //This line has the issue
            statement.executeUpdate(myTableName);
            System.out.println("Table Created");
        }
        catch (SQLException e ) {
            System.out.println("An error has occured on Table Creation");
            e.printStackTrace();
        }
    }

    public static void main(String []args) throws Exception {
        //Make sure your import works if you run your code multiple times.
        // for this first start drop table then create table,
        // You can not any problem using this way :-)

        EmployeeExample ma = new EmployeeExample();
        ma.dropTable();
        ma.createTable();
        ma.readEmployee();
        ma.insertEmployee();
        ma.readEmployee();
    }
}

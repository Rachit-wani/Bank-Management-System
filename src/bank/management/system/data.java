package bank.management.system;
import java.sql.*;

public class data {
    Connection connection;
    Statement statement;

    public data()
    {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybank","root","rachit01");
            statement = connection.createStatement();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

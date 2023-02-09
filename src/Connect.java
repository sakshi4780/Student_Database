import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    Connection con;
    public Connection connection(String database){
        String url = "jdbc:mysql://localhost:3306/"+database;
        String user = "root";
        String pass = "root";
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("done");
        } catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        }

        return con;
    }
}

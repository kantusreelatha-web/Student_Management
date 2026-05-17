import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "root";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}

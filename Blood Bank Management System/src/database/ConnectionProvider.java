package database;
import java.sql.*; 

public class ConnectionProvider {
    private static final String url = "jdbc:mysql://localhost:3306/bbms?useSSL=false&allowPublicKeyRetrieval=true"; 
    public static Connection getConnection() {
        Connection connection = null; 
        try {
            // com.mysql.cj.jdbc.Driver [NEW]
            // com.mysql.jdbc.Driver    [DEPRECATED]
            Class.forName("com.mysql.jdbc.Driver"); 
            connection = DriverManager.getConnection(url, "root", "12345");
        } 
        catch(Exception e) {
        }
        return connection; 
    }
}

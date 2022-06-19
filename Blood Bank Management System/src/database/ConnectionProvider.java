package database;
import java.sql.Connection; 
import java.sql.DriverManager; 

public class ConnectionProvider {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bbms"; 
    public static Connection getConnection() {
        Connection connection = null; 
        try {
            // com.mysql.cj.jdbc.Driver [NEW]
            // com.mysql.jdbc.Driver    [DEPRECATED]
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            connection = DriverManager.getConnection(DB_URL, "root", "12345");
        } 
        catch(Exception e) {
        }
        return connection; 
    }
    
    public static void main(String[] args) {
        Connection connection = ConnectionProvider.getConnection(); 
        
        if(connection != null) {
            System.out.println("Connection established");
        } 
        else {
            System.out.println("Connection failed");
        }
    }
}

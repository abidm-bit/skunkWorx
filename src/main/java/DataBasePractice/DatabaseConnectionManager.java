package DataBasePractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//singleton class to manage the DB connection

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;
    private final String url;

    private DatabaseConnectionManager() throws SQLException {

        // Initialize the SQLite connection URL
        url = "jdbc:sqlite:/Users/mabid/IdeaProjects/skunkWorx/src/main/resources/jdbcPractice";


        // Create the connection
        connection = DriverManager.getConnection(url);
    }

    public static synchronized DatabaseConnectionManager getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }


}

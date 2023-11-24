package week9Database.movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private String databasePath;
    Database(String databasePath) { // constructor

        // create table, or make sure it is created

        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE IF NOT EXISTS" + "movies (name text, stars INTEGER, watched BOOLEAN) ");
        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }
    }
}

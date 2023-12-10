package week9Database.movies;

import java.sql.*;

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

    public void addNewMovie(Movie movie) {
        String insertSQL = "INSERT INTO MOVIES VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(databasePath); // Connect using string from DBConfig
              PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            // todo add movie
            //insert into movie values ('UP',4,true);

            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because " + e);
        }
    }
}

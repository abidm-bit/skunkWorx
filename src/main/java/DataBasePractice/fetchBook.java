package DataBasePractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Arrays;

class fetchBook {
    protected static String[] bookInfo = new String[3];

    protected static void fetchRandomBookFromDB() {
        String query = "SELECT book,author,isbn13 FROM myLibrary ORDER BY RANDOM() LIMIT 1";

        try (Connection connection =
                     DriverManager.getConnection(System.getenv("DB_URL"),System.getenv("POSTGRES_USER"),System.getenv("POSTGRES_PASSWORD"));
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                bookInfo[0] = resultSet.getString("book");
                bookInfo[1] = resultSet.getString("author");
                bookInfo[2] = resultSet.getString("isbn13");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        for(int i =0 ; i<=9;i++){
            fetchRandomBookFromDB();
            System.out.println(Arrays.toString(bookInfo));
        }

}}

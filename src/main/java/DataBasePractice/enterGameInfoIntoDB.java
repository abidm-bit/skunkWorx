package DataBasePractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class enterGameInfoIntoDB {

    protected static void recordGameIntoArchive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's a game you remember playing?");
        String game = scanner.nextLine();
        System.out.println("What system did you play this game on?");
        String system = scanner.nextLine();
        scanner.close();

        String query = "INSERT INTO gamesarchive (game, system) VALUES (?, ?)";

        try (  Connection connection = DatabaseConnectionManager.getInstance().getConnection();
               PreparedStatement statement = connection.prepareStatement(query)
        ) {

            statement.setString(1, game);   // ? == 1
            statement.setString(2, system); // ? == 2

            // Execute the query (use executeUpdate for INSERT)
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Game recorded into the archive!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        recordGameIntoArchive();
    }
}

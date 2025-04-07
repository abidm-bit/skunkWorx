package DataBasePractice;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.System.out;

class enterGameInfoIntoDB {

    protected static void recordGameIntoArchive() {
        Scanner scanner = new Scanner(System.in);
        out.println("What's a game you remember playing?");
        String game = scanner.nextLine();
        out.println("What system did you play this game on?");
        String system = scanner.nextLine();


        String query = "INSERT INTO gamesarchive (game, system) VALUES (?, ?)";

        try (  Connection connection = DatabaseConnectionManager.getInstance().getConnection();
               PreparedStatement statement = connection.prepareStatement(query)
        ) {

            statement.setString(1, game);   // ? == 1
            statement.setString(2, system); // ? == 2

            // Execute the query (use executeUpdate for INSERT)
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                out.println("Game recorded into the archive!");
            }

        } catch (SQLException e) {
            out.println(e.getMessage());
        }
        scanner.close();
    }


    public static void main(String[] args) {

        recordGameIntoArchive();

    }
}

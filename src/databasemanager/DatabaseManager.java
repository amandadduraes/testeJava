import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/imdb";
        String user = "postgres";
        String password = "ema147";
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexão bem-sucedida ao banco de dados PostgreSQL!");
            connection.close(); 
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados PostgreSQL:");
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String createUserTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                    + "id SERIAL PRIMARY KEY,"
                    + "username VARCHAR(255) UNIQUE NOT NULL,"
                    + "password VARCHAR(255) NOT NULL,"
                    + "role VARCHAR(20) NOT NULL,"
                    + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                    + ")";
            
            String createMoviesTableSQL = "CREATE TABLE IF NOT EXISTS movies ("
                    + "id SERIAL PRIMARY KEY,"
                    + "title VARCHAR(255) NOT NULL,"
                    + "director VARCHAR(255),"
                    + "genre VARCHAR(100),"
                    + "release_date DATE,"
                    + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                    + ")";
            
            String createRatingsTableSQL = "CREATE TABLE IF NOT EXISTS ratings ("
                    + "id SERIAL PRIMARY KEY,"
                    + "movie_id INTEGER REFERENCES movies(id) ON DELETE CASCADE,"
                    + "user_id INTEGER REFERENCES users(id) ON DELETE CASCADE,"
                    + "rating INTEGER,"
                    + "CONSTRAINT chk_rating CHECK (rating BETWEEN 0 AND 4),"
                    + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                    + ")";

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createUserTableSQL);
                statement.executeUpdate(createMoviesTableSQL);
                statement.executeUpdate(createRatingsTableSQL);
                System.out.println("Tabelas criadas com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

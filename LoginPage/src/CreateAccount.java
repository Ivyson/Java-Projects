import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateAccount {

    private Connection connection;

    public CreateAccount() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/mysql";
            String dbUsername = "root";
            String dbPassword = "Samkelow82*Pass";
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
    }

    public boolean createAccount(String username, String password, String Email) {
        if (connection == null) {
            return false; // Connection failed
        }

        try {
            String insertSQL = "INSERT INTO your_table_name (Username, Passwords) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            //preparedStatement.setString(3, password);
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0; // Return true if account creation is successful
        } catch (SQLException e) {
            System.err.println("Error creating account: " + e.getMessage());
            return false; // Account creation failed
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing database connection: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CreateAccount accountManager = new CreateAccount();

        boolean accountCreated = accountManager.createAccount("newUser", "newPassword","newEmail");

        if (accountCreated) {
            System.out.println("User account created successfully!");
        } else {
            System.out.println("Failed to create user account.");
        }

        accountManager.closeConnection();
    }
}

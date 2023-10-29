import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createAccountButton;

    public LoginApp() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(getBackground());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        createAccountButton = new JButton("Create Account");
        loginButton.addActionListener(this);
        createAccountButton.addActionListener(this);
        //Adding the components of the page.
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(createAccountButton);
        add(panel);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginButton) {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        String message = "Username: " + username + "\nPassword: " + password;
        System.out.println(message);

        // Check if the username and password match the default values
        if (username.equals("Samkelo") && password.equals("Sam")) {
            JOptionPane.showMessageDialog(this, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("The log in was successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Please check your credentials.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Login failed");
        }
    } else if (e.getSource() == createAccountButton) {
        Register obj = new Register();
        // Add code here to handle account creation
        /*@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginButton) {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        // Add code here to check if the username and password are valid in your database.
        // For this example, let's display the captured information in the terminal.
        String message = "Username: " + username + "\nPassword: " + password;
        System.out.println(message);
    } else if (e.getSource() == createAccountButton) {
        // Add code here to open a registration form for creating a new account.
    }
} */
    }
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginApp app = new LoginApp();
            app.setVisible(true);
        });
    }
}

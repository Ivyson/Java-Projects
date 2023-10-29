package switchingvariables;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class SwitchingVariables {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String db = "jdbc:ucanaccess:Users/Sam/OneDrive/Documents/My Java Projects/My Java Projects/SwitchingVariables/Usernamesetup.accdb";
         Connection connection = null;
        try {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Register the driver
            connection = DriverManager.getConnection(db);
            if(connection != null)
            {
                System.out.println("The connection was created succesfully");
            }
            else
            {
                System.out.println("The connection was not established");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
         input.close();
    }
}

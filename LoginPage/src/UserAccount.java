
import java.util.HashMap;

public class UserAccount {
      HashMap<String,String> Login_info = new HashMap<>();
    public UserAccount() {
        Login_info.put("Sam", "Sam123");
        Login_info.put("Samkelo", "Samkelo123");
        Login_info.put("Admin", "Admin321");
        
        }
    protected HashMap getLogin_Info()
    {
    return Login_info;
    }
    
}

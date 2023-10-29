  import java.util.Scanner;
  import java.lang.Character;
  public class App{
    App()
    {

    }
  public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Home page");
        System.out.println("Which ption do you want to choose.\n1. Log In\n2.Register");
        int opt ;
        opt = input.nextInt();
        if(opt == 1)
        {
            System.out.println("Please enter your account details.");
            System.out.println("Username:");
            //int opt2 = input.nextInt();
            String username = input.nextLine();
            System.out.println("Password:");
            String Pass = input.nextLine();
            if(Pass.equals("Admin123") && username.equals("Admin"))
            {
                System.out.println("The log in was succesful!");
            }
            else{
                System.err.println("The entered credentials fo not match any of our existing data");
            }
        }
        else if(opt == 2)
            {
                while(true){
            System.out.println("Enter the following:");
            System.out.println("Name:");
            String rName = input.nextLine();
            System.out.println("Surame:");
            String rSurname = input.nextLine();
            System.out.println("Email:");
            String rMail = input.nextLine();
            System.out.println("Password:");
            String rPass = input.nextLine();
            System.out.println("Enter Password again:");
            String rnPass = input.nextLine();
            if(rPass.equals(rnPass))
            {
                System.out.println("The account creation was succesful");
                System.out.println("Your details are as follows:");
                System.out.println("Name:"+rName+"\nSurname:"+rSurname+"\nEmail:"+rMail);
                System.out.println("Please confirm by entering Y/N");
                char opt3 = Character.toUpperCase(input.next().charAt(0));
                //char opt4 = 
                if(opt3 == 'Y')
                {
                    System.exit(0);
                    
                }
                else if (opt3 == 'N')
                {
                    
                }
            }
        }
    }
        
     
        input.close();
    }
  }
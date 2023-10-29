import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter an integer : ");
        String num = input.nextLine();
        try {
            int number = Integer.parseInt(num);
            if( number % 2 == 0)
        {
            System.out.printf("The entered Number is an even number");
        }
        else{
            System.out.println("The entered number is an odd number");
        }
        } catch (NumberFormatException e) {
            System.out.printf("The number that you entered cannot be converted to an integer");
        }*/
        //Question 5
        /*int num = 1;
        System.out.print("You want to find the factorial of : ");
        String factorial = input.nextLine();
        try {
            int fact = Integer.parseInt(factorial);
            int count = fact;
            if(fact == 0 || fact == 1)
            {
                System.out.println("The Factorial of "+count+" is: 1");
            }
            else if(fact < 0)
            {
                System.out.println("The Factorial of a negative number doesn't exist");
            }
            else
            {
            FindFactorial(fact,num,count);
            }
        } catch (Exception e) {
            System.out.println("The Number You entered is invalid");
        }

        input.close();
        }
        public static void FindFactorial(int fact, int num, int count)
        {
        
            fact = fact * num;
            num++;
            if(num < count){
                
            FindFactorial(fact,num,count);}
            else {
                System.out.println("The Factorial of "+count+" is: "+fact);
            }
        }*/
        //Question 7
       /* int count = 0;
        //System.out.println("Input any String : ");
        String name = JOptionPane.showInputDialog(null, "Input any String");
        char[] charArray = name.toCharArray();
        for (char c : charArray)
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count ++;
            }
        }
        JOptionPane.showMessageDialog(null,"There are "+count+" vowels in your string");*/
        //Question 3
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        JOptionPane.showMessageDialog(null,"The minimum number is \n"+min+"\nThe Maximum number is \n"+max);
        input.close();

    }
    }
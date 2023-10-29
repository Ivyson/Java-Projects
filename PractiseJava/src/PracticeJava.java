import javax.swing.JOptionPane;
public class PracticeJava {
    double result1;
public double adding(double num1 , double num2)
{
    return (num1 + num2);
}
public double Multiplication(double num1 , double num2)
{
    return  (num1 * num2);
}
public double division(double num1 , double num2)
{
    return (num1 / num2);
}
public double Subtract(double num1 , double num2)
{
    return (num1 - num2);
}
public int  Factorial(int num1 )
{
    if(num1 == 0)
    {
        return 1;
    }
    int fact = num1;
    for (int i = 1; i < num1; i++)
    {
        fact = i * fact;
    }
    return fact;
}
public double root (double num1, double num2)
{
    //int power = (int)num2;
    //double results = Math.pow(num2, power);
    return (Math.pow(num1, 1/num2));
}
public double Trigonometry(double num1, int Option2)
{
    
    switch (Option2) 
    {
        case 1:
        result1 = Math.cos(num1);
        break;
        case 2:
        result1 = Math.tan(num1);
        break;
        case 3:
        result1 = Math.sin(num1);
        break;
        case 4:
        result1 = 1/Math.cos(num1);
        break;
        case 5:
        result1 = 1/Math.tan(num1);
        break;
        case 6:
        result1 = 1/Math.sin(num1);
        break;
        default:
        JOptionPane.showMessageDialog(null, "The option you have entered is incorrect!");
        System.exit(0);
    }
    return result1;
}
public double power (double num1, double num2)
{
    return (Math.pow(num1, num2));
}
public double logarithm(double num1)
{
    return (Math.log10(num1));
}

    public static void main(String[] args) throws Exception {
        PracticeJava obj = new PracticeJava();
        Double num1;
        Double num2;
        int Option1;
        double results;
        Option1 = Integer.parseInt(JOptionPane.showInputDialog("What Oparation do you want to perform \n 1.Multiplication \n2.Addition \n3.Subtraction \n4.Trigonometryic functions \n5.Logs \n6.Factorials \n7. Radical signs\n8.Powers "));
        switch( Option1 )
        {
            case 1:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Second number"));
            results = obj.Multiplication(num1,num2);
            JOptionPane.showMessageDialog(null,"The product is : "+results);
            break;
            case 2:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Second number"));
            results = obj.adding(num1,num2);
            JOptionPane.showMessageDialog(null,"The sum of the two numbers is : "+results);
            break;
            case 3:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Second number"));
            results = obj.Subtract(num1, num2);
            JOptionPane.showMessageDialog(null,"The difference between the two numbers is : "+results);
            break;
            case 4:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
            int Option2 = Integer.parseInt(JOptionPane.showInputDialog("What Trigonometric Function do you want to utilise\n 1.Cosine \n 2.Tangent \n3. Sine \n 4.Cosec \n5.Cotangent \n6.Secant"));
            results = obj.Trigonometry(num1, Option2);
            JOptionPane.showMessageDialog(null,"The results are : "+results);
            break;
            case 5:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
            results = obj.logarithm(num1);
            JOptionPane.showMessageDialog(null,"The Log of "+num1+" is :" +results);
            break;
            case 6:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
            JOptionPane.showMessageDialog(null,"The Number Your Entered will be Parsed to the nearest integer :" +Math.floor(num1));
            int numberupdated = (int) Math.round(num1);
            results = obj.Factorial(numberupdated);
            JOptionPane.showMessageDialog(null,"The Factorial of "+num1+"is :" +results);
            break;
            case 7:
             num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
             num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the number on the root(square root has 2 as an argument)"));
             results = obj.root(num1, num2);
            JOptionPane.showMessageDialog(null,"The root of  "+num1+"is :" +results);
            break;
            case 8:
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Base "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Power"));
            results = obj.power(num1, num2);
            JOptionPane.showMessageDialog(null,""+num1+" raised to "+num2+" is equivalent to : "+results);
            break;
            default:
            JOptionPane.showMessageDialog(null,"The Option you entered doesn't exist");

        }
        
    }
}

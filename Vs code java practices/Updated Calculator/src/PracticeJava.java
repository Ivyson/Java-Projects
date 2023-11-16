import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*; //Import the scanner Library just in case i will need to use a scanner instead of casting the value from a JOptionPane
//Use math library that has maths methods in it to perform complex maths operations like complex numbers and all those things

public class PracticeJava {
    double result1;

    public double adding(double num1, double num2) {
        return (num1 + num2);
    }

    public double Multiplication(double num1, double num2) {
        return (num1 * num2);
    }

    public double division(double num1, double num2) {
        return (num1 / num2);
    }

    public double Subtract(double num1, double num2) {
        return (num1 - num2);
    }

    public int Factorial(int num1) {
        if (num1 == 0) {
            return 1;
        } else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, "The Factorial of a negative number does not exist!");
            System.exit(0);
        }
        int fact = num1;
        for (int i = 1; i < num1; i++) {
            fact = i * fact;
        }
        return fact;
    }

    public double root(double num1, double num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "The number on the power cannot be zero");
        } else if (num1 < 0) {
            // Handle negative number case if needed
        }
        return (Math.pow(num1, 1 / num2));
    }

    public double Trigonometry(double num1, int Option2) {
        switch (Option2) {
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
                result1 = 1 / Math.cos(num1);
                break;
            case 5:
                result1 = 1 / Math.tan(num1);
                break;
            case 6:
                result1 = 1 / Math.sin(num1);
                break;
            case 7:
                result1 = Math.sinh(num1);
                break;
            case 8:
                result1 = Math.cosh(num1);
                break;
            case 9:
                result1 = Math.tanh(num1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "The option you have entered is incorrect!");
                System.exit(0);
        }
        return result1;
    }

    public double power(double num1, double num2) {
        return (Math.pow(num1, num2));
    }

    public void logarithm() {
        double num1, num2;
        int logoption = Integer.parseInt(JOptionPane.showInputDialog("What type of log do you want to use\n1.Natural Logs\n2.Logs with modified base"));
        double results;
        if (logoption == 1) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Argument"));
            results = Math.log(num1);
            JOptionPane.showMessageDialog(null, "The Natural Log of " + num1 + " is :" + results);
        } else if (logoption == 2) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Base of your log"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Argument"));
            results = (Math.log10(num1) / Math.log10(num2));
            JOptionPane.showMessageDialog(null, "The Log of " + num1 + " with a base of " + num2 + " is :" + results);
        } else {
            JOptionPane.showMessageDialog(null, "The option you entered is invalid");
            System.exit(0);
        }
    }

    public void arithmaticseq() {
        int num_terms = Integer.parseInt(JOptionPane.showInputDialog("How Many terms does your series have:"));
        double first_term = Double.parseDouble(JOptionPane.showInputDialog("What is your first term"));
        double comm_diff = Double.parseDouble(JOptionPane.showInputDialog("What is the common difference"));
        double sum = num_terms * (2 * first_term + (num_terms - 1) * comm_diff) / 2;
        for (int i = 1; i <= num_terms; i++) {
            double tn = 2 * first_term + (num_terms - 1) * comm_diff;
            System.out.printf("%lf\t", tn);
        }
        System.out.println("The sum of all the terms in this series is " + sum);
    }
    //Finding factors of a number
    public void numberfactor(int num)
    {
        int j = 0;
        Integer[] factors;
        //Integer index = num;
        Integer[] arr = new Integer[num];
        for(int i = 1; i <= num; i++) 
        {
            if(num % i == 0)
            {
                arr[j] = i;
                System.out.println(arr[j]);
                j++;
                
            }
        } 
        
        factors = Arrays.copyOf(arr, j);// This is to copy and use only the critical values stored and not all the values stored in arr
        JOptionPane.showMessageDialog(null,Arrays.toString(factors));  
    }
    //Finding factors of a quadratic formula
    public void Quadratic()
    {
        Double secPower = Double.parseDouble(JOptionPane.showInputDialog("What is the value of the highest power(x^2)"));
        Double bValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b,The coefficient of x"));
        Double constant = Double.parseDouble(JOptionPane.showInputDialog("Enter the value constant/The value that has no x in it"));
        Double disciminant = bValue*bValue -4*secPower*constant;
        Double x1,x2;
        if(disciminant < 0)
        {
            JOptionPane.showMessageDialog(null, "This function has factors that belong in the complex number plane");
        }
        else{
            x1 = -(bValue/2) + Math.sqrt(disciminant)/2;
            x2 = -(bValue/2) - Math.sqrt(disciminant)/2;
            JOptionPane.showMessageDialog(null, "The x- intercepts are :"+x1+"; "+x2+ "\n The y-intercept :"+constant);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "The Y-intercept of the graph is: "+constant);
    }
    //Representing numbers in the Scientific Notation
    public void ScForm()
    {
        int ScNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        if(ScNum == 0)
        {
            JOptionPane.showMessageDialog(null, "0 in Scientific notation can be written as 0.00E0");
        }

        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        symbol.setExponentSeparator("E");
        DecimalFormat df = new DecimalFormat("0.00E0", symbol);
        JOptionPane.showMessageDialog(null, "The representation of "+ScNum+" is: "+df.format(ScNum));

    }
    
    //Finding a gradient of a straight line
    //Finding a first derivative of a quadratic functions and cubic functions,sin,cosine and tan graphs
    //Using an online algorithm, find the more complex functions' critical values like Cubic functions and more
    //Finding geometric sigma and and sum to infinity
    //Area of a triangle - Cone - Parabola - ellipse - cylinder - ellipsoid(surface area) 

    //@Auhtor Sam.

    public static void main(String[] args) {
        PracticeJava obj = new PracticeJava();
        Double num1;
        Double num2;
        int Option1;
        double results;
        try {
            Option1 = Integer.parseInt(JOptionPane.showInputDialog("What Operation do you want to perform \n1.Multiplication \n2.Addition \n3.Subtraction \n4.Trigonometric functions \n5.Logs \n6.Factorials \n7. Radical signs\n8.Powers\n9.Arithmetic sum\n10.Finding factors of a number\n11.Finding factors of a quadratic formula\n12.More.."));
            switch (Option1) {
                case 1:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Second number"));
                    results = obj.Multiplication(num1, num2);
                    JOptionPane.showMessageDialog(null, "The product is : " + results);
                   obj.numberfactor(10);
                    break;
                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Second number"));
                    results = obj.adding(num1, num2);
                    JOptionPane.showMessageDialog(null, "The sum of the two numbers is : " + results);
                    break;
                case 3:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Second number"));
                    results = obj.Subtract(num1, num2);
                    JOptionPane.showMessageDialog(null, "The difference between the two numbers is : " + results);
                    break;
                case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the argument"));
                    int Option2 = Integer.parseInt(JOptionPane.showInputDialog("What Trigonometric Function do you want to utilize\n1.Cosine \n2.Tangent \n3. Sine \n4.Cosec \n5.Cotangent \n6.Secant\n7.hyp Sine\n8.hyp Cos\n9.hypTan"));
                    results = obj.Trigonometry(num1, Option2);
                    JOptionPane.showMessageDialog(null, "The results are : " + results);
                    break;
                case 5:
                    obj.logarithm();
                    break;
                case 6:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
                    JOptionPane.showMessageDialog(null, "The Number You Entered will be Parsed to the nearest integer: " + Math.round(num1));
                    int numberupdated = (int) Math.round(num1);
                    results = obj.Factorial(numberupdated);
                    JOptionPane.showMessageDialog(null, "The Factorial of " + Math.round(num1) + " is : " + results);
                    break;
                case 7:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the number on the root (square root has 2 as an argument)"));
                    results = obj.root(num1, num2);
                    JOptionPane.showMessageDialog(null, "The root of " + num1 + " is :" + results);
                    break;
                case 8:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Base "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Power"));
                    results = obj.power(num1, num2);
                    JOptionPane.showMessageDialog(null, "" + num1 + " raised to " + num2 + " is equivalent to: " + results);
                    break;
                case 9:
                    obj.arithmaticseq();
                    break;
                case 10:
                    int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
                    obj.numberfactor(number);
                    break;
                case 11:
                    obj.Quadratic();
                    break;
                case 12:
                    int option2 = Integer.parseInt(JOptionPane.showInputDialog("1.Scientific Notation"));
                    switch (option2) {
                        case 1:
                            obj.ScForm();
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "The Option you entered doesn't exist");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }
}

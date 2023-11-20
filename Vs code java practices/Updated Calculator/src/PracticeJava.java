import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*; //Import the scanner Library just in case i will need to use a scanner instead of casting the value from a JOptionPane
//Use math library that has maths methods in it to perform complex maths operations like complex numbers and all those things

public class PracticeJava {
    double result1;
    Scanner scanner;
    public final Double PI = 3.141592654;

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

    public void root(double num1, double num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "The number on the power cannot be zero");
        } else if (num1 < 0) {
            // Handle negative number case if needed
            System.out.println("The "+num2+" Root of "+num1+" is : "+Math.pow(Math.abs(num1), 1/num2)+"i");
        }
        else{
            JOptionPane.showMessageDialog(null, "The "+num2+" Root of "+num1+" is : "+Math.pow(Math.abs(num1), 1/num2));
        }
        //return (Math.pow(num1, 1 / num2));
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
        Double tn;
        for (int i = 1; i <= num_terms; i++) {
            tn = first_term + (i - 1) * comm_diff;
            System.out.printf("%.0f\t", tn);
        }
        System.err.println();
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
     //Method for Matrices
     public void matrix()
     {
        //Specifically for 2D Matrices
        Integer[][] matrices;
        scanner = new Scanner(System.in);
        int row = Integer.parseInt(JOptionPane.showInputDialog("Your matrix has how many rows"));
        int columns = Integer.parseInt(JOptionPane.showInputDialog("How many columns does your matrix have"));
        matrices = new Integer[row][columns];
        JOptionPane.showMessageDialog(null, "Everything else from here will be done on the console");
        System.out.println("You will be asked to input the vaalues of in the matrice");
        for(int i = 0; i < row; i++)
        {
        for (int j = 0; j < columns; j++)
            {
                System.out.printf("Matrice[%d][%d]=",i+1,j+1);
                matrices[i][j] = scanner.nextInt();
                scanner.nextLine(); //To consume the next line character created by a user pressing enter
            }
            //System.out.println("\n");
        }
        System.out.println("Your matrice will be displayed below!");
        for(int i = 0; i < row; i++)
        {
            System.out.printf("|");
            for (int j = 0; j < columns; j++)
            {
                System.out.printf("%d\t",matrices[i][j]);
            }
            System.out.printf("|\n");
        }
        int option = Integer.parseInt(JOptionPane.showInputDialog("Which Matrice operation do you want to perfom\n1.Transpose of matrice"));
        switch (option) {
            case 1:
            System.out.println("__________________________");
            System.out.println("The Transpose of your matrice:");
                for(int i = 0; i < columns; i++)
                {
                    System.out.printf("|");
                    for(int j = 0; j < row; j++)
                    {
                        System.out.printf("%d\t",matrices[j][i]);
                    }
                    System.out.printf("|\n");
                }
                break;
            case 2:
                if(row == columns)
                {

                }
                else
                {
                    System.out.println("The determinant of a non square matrix is undefined");
                }
                break;
            
            default:
                break;
        }

     }
     public void complex()
     {
        Double Imaginery,real,modulus,argument,ArgDegrees,real2,Imaginery2,real3,Imaginery3,modulus2,modulus3,argument2,argument3,realresult,ImagineryResult;
        Double modulusresult,argumentResult,realResult;
         Integer Option;
        Integer Opt = Integer.parseInt(JOptionPane.showInputDialog("How many complex numbers are we dealing with:\n1.One\n2.Two\3.Three"));
        switch (Opt) {
            case 1: //For 1 complex number
            real = Double.parseDouble(JOptionPane.showInputDialog("Enter the real number"));
        Imaginery = Double.parseDouble(JOptionPane.showInputDialog("Enter the Imaginery number(without the i/j)"));
        modulus = Math.sqrt(Imaginery*Imaginery + real*real);
        //Provide the answer according to the correct quadrant(real >> x; Imaginery >> y)
        if(real > 0 && Imaginery > 0) //First quadrant
        {
            argument = Math.abs(Math.atan(Imaginery/real));// Provided value is in radians
        }
        else if(real > 0 && Imaginery < 0) //4th Quadrant
        {
            argument = 2*PI - Math.abs(Math.atan(Imaginery/real));
        }
        else if(real < 0 && Imaginery < 0) //3rd quadrant 
        {
            argument = PI + Math.abs(Math.atan(Imaginery/real));
        }
        else { //Second quadrant
            argument = PI - Math.abs(Math.atan(Imaginery/real));
        }
        ArgDegrees = (180/PI)*argument;
        JOptionPane.showMessageDialog(null, "The arguement of the entered complex numberin radians is "+argument+"\nThe arguement of the entered complex number in Degrees is "+ArgDegrees);
            break;
        case 2: //Operating on two complex numbers
                Option = Integer.parseInt(JOptionPane.showInputDialog("What operation do you want to perform:\n1.Addition\n2.Division\n3.Multiplication\n4.Subtraction"));
            switch (Option) {
            case 1:
                real = Double.parseDouble(JOptionPane.showInputDialog("Enter the real number"));
                Imaginery = Double.parseDouble(JOptionPane.showInputDialog("Enter the Imaginery number(without the i/j)"));
                modulus = Math.sqrt(Imaginery * Imaginery + real * real);
                real2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the real number"));
                Imaginery2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Imaginery number(without the i/j)"));
                modulus2 = Math.sqrt(Imaginery * Imaginery + real * real);
                break;
                //Add code and cases for two complex numbers operation
                default:// For 2 complex numbers
                break;
            }       
        case 3: //For three Complex numbers
                  Option = Integer.parseInt(JOptionPane.showInputDialog("What operation do you want to perform:\n1.Addition\n2.Division\n3.Multiplication\n4.Subtraction"));
                  real = Double.parseDouble(JOptionPane.showInputDialog("1.Enter the real number"));
                Imaginery = Double.parseDouble(JOptionPane.showInputDialog("1.Enter the Imaginery number(without the i/j)"));
                modulus = Math.sqrt(Imaginery * Imaginery + real * real);
                real2 = Double.parseDouble(JOptionPane.showInputDialog("2.Enter the real number"));
                Imaginery2 = Double.parseDouble(JOptionPane.showInputDialog(".2Enter the Imaginery number(without the i/j)"));
                modulus2 = Math.sqrt(Imaginery * Imaginery + real * real);
                real3 = Double.parseDouble(JOptionPane.showInputDialog("3.Enter the real number"));
                Imaginery3 = Double.parseDouble(JOptionPane.showInputDialog("3.Enter the Imaginery number(without the i/j)"));
                modulus3 = Math.sqrt(Imaginery * Imaginery + real * real);
                //Provide the answer according to the correct quadrant(real >> x; Imaginery >> y)
        if(real > 0 && Imaginery > 0) //First quadrant
        {
            argument = Math.abs(Math.atan(Imaginery/real));// Provided value is in radians
        }
        else if(real > 0 && Imaginery < 0) //4th Quadrant
        {
            argument = 2*PI - Math.abs(Math.atan(Imaginery/real));
        }
        else if(real < 0 && Imaginery < 0) //3rd quadrant 
        {
            argument = PI + Math.abs(Math.atan(Imaginery/real));
        }
        else { //Second quadrant
            argument = PI - Math.abs(Math.atan(Imaginery/real));
        }
        //For complex number 2
        if(real2 > 0 && Imaginery2 > 0) //First quadrant
        {
            argument2 = Math.abs(Math.atan(Imaginery2/real2));// Provided value is in radians
        }
        else if(real2 > 0 && Imaginery2 < 0) //4th Quadrant
        {
            argument2 = 2*PI - Math.abs(Math.atan(Imaginery2/real2));
        }
        else if(real2 < 0 && Imaginery2 < 0) //3rd quadrant 
        {
            argument2 = PI + Math.abs(Math.atan(Imaginery2/real2));
        }
        else { //Second quadrant
            argument2 = PI - Math.abs(Math.atan(Imaginery2/real2));
        }
        //For complex number 3
        if(real3 > 0 && Imaginery3 > 0) //First quadrant
        {
            argument3 = Math.abs(Math.atan(Imaginery3/real3));// Provided value is in radians
        }
        else if(real3 > 0 && Imaginery3 < 0) //4th Quadrant
        {
            argument3 = 2*PI - Math.abs(Math.atan(Imaginery3/real3));
        }
        else if(real3 < 0 && Imaginery3 < 0) //3rd quadrant 
        {
            argument3 = PI + Math.abs(Math.atan(Imaginery3/real3));
        }
        else { //Second quadrant
            argument3 = PI - Math.abs(Math.atan(Imaginery3/real3));
        }
                
        switch (Option) {
            case 1:
                //Addition of 3 complex numbers
            realresult = real + real2 + real3;
            ImagineryResult = Imaginery + Imaginery2 + Imaginery3;
            JOptionPane.showMessageDialog(null, "The Resulting complex number is "+realresult+"+("+ImagineryResult+")i");
                break;
            case 2:
            //Division of three complex numbers Needs to handle the way of dividing, if we divide all of the 3 complex numbers in one term or ...

            break;
            case 3:
            //Multiplication of all these complex numbers
            modulusresult = modulus*modulus2*modulus3;
            argumentResult = argument + argument2 + argument3;
            //System.out.println("The modulus of the resulting complex number "+modulusresult+" and the argument is "+argumentResult);
            realResult = modulusresult * Math.cos(argumentResult);
            ImagineryResult = modulusresult * Math.sin(argumentResult);
            System.out.println("The resulting complex number : "+realResult+"+("+ImagineryResult+" )i");
            break; //Operation on three complex numbers
            default: 
                break;
        }
         
            default:// For number of Complex numbers dealing with.
                break;
         }
       
    }
     

    ///*Handle the issue of when the Imaginer number is zero! */
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
                    obj.root(num1, num2);
                    //JOptionPane.showMessageDialog(null, "The root of " + num1 + " is :" + results);
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
                    int option2 = Integer.parseInt(JOptionPane.showInputDialog("1.Scientific Notation\n2.Matrix\n3.Complex numbers"));
                    switch (option2) {
                        case 1:
                            obj.ScForm();
                            break;
                        case 2:
                            obj.matrix();
                            break;
                        case 3:
                            obj.complex();
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
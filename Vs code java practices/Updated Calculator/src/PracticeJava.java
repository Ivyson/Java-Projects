import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*; //Import the scanner Library just in case i will need to use a scanner instead of casting the value from a JOptionPane
//Use math library that has maths methods in it to perform complex maths operations like complex numbers and all those things

public class PracticeJava {
    double result1;
    Scanner scanner;
    public final Double PI = 3.1415926535897932384626433832795;

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
            JOptionPane.showMessageDialog(null, "The "+num2+" Root of "+num1+" is : "+Math.pow(Math.abs(num1), 1/num2)+"i");
            //System.out.println("The "+num2+" Root of "+num1+" is : "+Math.pow(Math.abs(num1), 1/num2)+"i");
        }
        else{
            JOptionPane.showMessageDialog(null, "The "+num2+" Root of "+num1+" is : "+Math.pow(Math.abs(num1), 1/num2));
        }
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
        if(disciminant < 0) //Handle the complex number factorisation!!!!!
        {
            JOptionPane.showMessageDialog(null, "This function has factors that belong in the complex number plane");
            JOptionPane.showMessageDialog(null, "z1="+(-bValue/2)+"+"+Math.sqrt(Math.abs(disciminant))/2+"i\nz2="+(-bValue/2)+"-"+Math.sqrt(Math.abs(disciminant))/2+"i");
            System.out.println("z1="+(-bValue/2)+"+"+Math.sqrt(Math.abs(disciminant))/2+"i\nz2="+(-bValue/2)+"-"+Math.sqrt(Math.abs(disciminant))/2+"i");
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
        MatrixMultiplication obje = new MatrixMultiplication();
        Integer[][] matrices;
        int row,columns;
        int option2;
        scanner = new Scanner(System.in);
        int option = Integer.parseInt(JOptionPane.showInputDialog("Dealing with how many matrice:\n1.1 Matrice\n2. Two matrix"));
        switch(option)
        {
            case 1:
            row = Integer.parseInt(JOptionPane.showInputDialog("Your matrix has how many rows"));
            columns = Integer.parseInt(JOptionPane.showInputDialog("How many columns does your matrix have"));
            matrices = new Integer[row][columns];
            JOptionPane.showMessageDialog(null, "Everything else from here will be done on the console");
            System.out.println("You will be asked to input the values of in the matrice");
            for(int i = 0; i < row; i++)
            {
            for (int j = 0; j < columns; j++)
                {
                    System.out.printf("Matrice[%d][%d]=",i+1,j+1);
                    matrices[i][j] = scanner.nextInt();
                    scanner.nextLine(); //To consume the next line character created by a user pressing enter
                }
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
                option2 = Integer.parseInt(JOptionPane.showInputDialog("What do you want to do:\n1.Display Transpose\n2. Display the size of the Matrice"));
                if(option2 == 1)
                {
                  // obje.displayTranspose(matrices[][],row,columns);
                }
                else if(option2 == 2)
                {
                    System.out.println("The size of the matrice is "+row+"x"+columns);
                }
                else{
                    System.out.println("The option selected is invalid");
                }
            }
            break;
            case 2:
                obje.MatriceOp();
            break;
        }
     }
    public void geometric()
    {
        //sn = a(r^n -1)/(r-1) ----if r is greater than 1. 
        // sn = a(r^n -1 )/(1-r) ---if r is less than 1, r should never be equal to zero
        //tn = a*r^(n-1)
        int num_terms;
        Double commonratio,first_term,sum,termnumber;
        num_terms = Integer.parseInt(JOptionPane.showInputDialog("How many number your terms does your series have"));
        first_term = Double.parseDouble(JOptionPane.showInputDialog("What is your first term of the series"));
        commonratio = Double.parseDouble(JOptionPane.showInputDialog("What is the common difference in your series"));
        termnumber = first_term * Math.pow(commonratio,num_terms-1);
        if(commonratio > 1)
        {
            sum = first_term*(Math.pow(commonratio,num_terms)-1)/(commonratio-1);
        }
        else if(commonratio < 1)
        {
            sum = first_term*(1-Math.pow(commonratio,num_terms))/(1- commonratio);
        }
        else
        {
             sum = first_term;
        }
        for(int i = 1; i <= num_terms; i++)
        {
            termnumber = first_term*Math.pow(commonratio,i-1);
            System.out.printf("%f\t",termnumber);
        }
        System.out.println("The sum of all these terms is: "+sum);
    }
     

    ///*Handle the issue of when the Imaginerey number is zero! */
    //Finding a gradient of a straight line
    //Using an online algorithm, find the more complex functions' critical values like Cubic functions and more
    //Finding geometric sigma and and sum to infinity
    //Area of a triangle - Cone - Parabola - ellipse - cylinder - ellipsoid(surface area) 

    //@Auhtor Sam.

    public static void main(String[] args) {
        PracticeJava obj = new PracticeJava();
        MatrixMultiplication mat = new MatrixMultiplication();
        ComplexNumbers complexNumbers = new ComplexNumbers();
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
                    JOptionPane.showMessageDialog(null, "The product : " + results);
                  // obj.numberfactor(10);
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
                            int numbercomplex;
                            numbercomplex = Integer.parseInt(JOptionPane.showInputDialog("How many complex numbers are you dealing with\n1.One\n2.Two"));
                            switch (numbercomplex) {
                                case 1:
                                     Double real,Imaginerey;
                                     real = Double.parseDouble(JOptionPane.showInputDialog("Enter the real magnitude of your complex number"));
                                     Imaginerey = Double.parseDouble(JOptionPane.showInputDialog("Enter the Imaginery magnitude of your complex number without the i/j"));
                                     complexNumbers.oneComplex(real, Imaginerey);
                                    break;
                                case 2:
                                    Double real1,real2,Imaginerey1,Imaginerey2;
                                    real1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the real magnitude of your complex number 1"));
                                    real2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the real magnitude of your complex number 2"));
                                    Imaginerey1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Imaginery magnitude of your complex number1 without the i/j"));
                                    Imaginerey2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the Imaginery magnitude of your complex number1 without the i/j"));
                                    complexNumbers.TwoComplex(real1, real2, Imaginerey1, Imaginerey2);
                                    break;
                                default:
                                JOptionPane.showMessageDialog(null, "The chosen option is just invalid!","Error 221",JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
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
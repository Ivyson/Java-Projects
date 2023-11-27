import java.util.Scanner;

public class Derivatives {
    Scanner scanner = new Scanner(System.in);
    Derivatives()
    {

    }
    public void linear()
    {
        Double gradient,Yinter;
        System.out.println("Enter the gradient of your straight line:");
        gradient = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the y intercept of your your straight line");
        Yinter = scanner.nextDouble();
        System.out.println("The Derivative of "+gradient+"x+("+Yinter+"-) is "+gradient);
    }
    public void quadratic()
    {
        Double Yinter,BValue,AValue;
        System.out.println("Enter the coefficient of x^2");
        AValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the Coefficient of x:");
        BValue = scanner.nextDouble();
        scanner.nextDouble();
        System.out.println("Enter the Y-intercept of the graph:");
        Yinter = scanner.nextDouble();
        System.out.println("The derivative of "+AValue+"x^2+("+BValue+")x+("+Yinter+") is ");
    }
}

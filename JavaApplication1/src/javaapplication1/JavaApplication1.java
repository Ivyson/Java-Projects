/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author 223146145
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.printf("Enter the first integer:");
       int num1 = input.nextInt();
       System.out.printf("Enter the second integer:");
       int num2 = input.nextInt();
       System.out.printf("What operation do you want to perform:");
       System.out.printf("\n1.Multiplication \n 2.Addition \n 3.Division \n 4.Subtraction \n");
       int option = input.nextInt();
       switch(option){
           case 1:
               int product = num1*num2;
               System.out.printf("The product of the two numbers is %d \n",product);
               break;
           case 2:
               int sum = num1 + num2;
               System.out.printf("The sum of the two numbers is %d \n",sum);
               break;
           case 3:
               float quotient = (float) num1/num2;
               System.out.printf("The quotient of the two numbers is %.2f \n",quotient);
               break;
           case 4:
               int subtraction = num1 - num2;
               System.out.printf("The difference between the two numbers is %d \n",subtraction);
               break;
           default:
               System.out.printf("The option you chose was incorrect");
       }
       if(num1 % num2 == 0)
       {
           int remainder =  num1/num2;
           System.out.printf("The ratio between the two numbers is : %d \n",remainder);
       }
       else
       {
           float remainder = (float) num1/num2;
           System.out.printf("The ratio between the two numbers is : %.2f \n",remainder);
       }
    }
    
}

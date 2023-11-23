import java.util.Scanner;

public class MatrixMultiplication {
    Scanner scanner;
    public MatrixMultiplication()
    {

    }
    //Trying to multiply two matrices
    public void Matrice()
    {
        scanner = new Scanner(System.in);
        int row1,column1,row2,column2,Option;
        int[][] Matrice1,Matrice2,result;
        System.out.println("How many rows does your first Matrice has?");
        row1 = scanner.nextInt();
        scanner.nextLine(); //To consume the new line created after the integer scanning
        System.out.println("How many columns does your first Matrice has?");
        column1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("How many rows does your second Matrice has?");
        row2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("How many columns does your second Matrice has?");
        column2 = scanner.nextInt();
        Matrice1 = new int[row1][column1];
        Matrice2 = new int[row2][column2];
        System.out.println("Please enter the data for the first matrice:");
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j < column1; j++)
            {
                Matrice1[i][j] = scanner.nextInt();
                scanner.nextLine(); //To ensure that the new line created is destroyed
            }
        }
        System.out.println("Please enter the data for the second matrice:");
         for(int i = 0; i < row2; i++)
        {
            for(int j = 0; j < column2; j++)
            {
                Matrice2[i][j] = scanner.nextInt();
                scanner.nextLine(); //To ensure that the new line created is destroyed
            }
        }
        System.out.println("What Matrix operation do you want to perform:\n1.Addition\n2.Multiplication");
        Option = scanner.nextInt();
        scanner.nextLine();
        switch(Option)
        {
            case 1:
                if(row1 == row2 && column1 == column2)
                {
                    result = new int[row1][column1];
                    for(int i = 0; i < row1; i++)
                    {
                        for(int j = 0; j < column1; j++)
                        {
                            result[i][j] = Matrice1[i][j] + Matrice2[i][j];
                        }
                    }

                     for(int i = 0; i < row1; i++)
                    {
                        for(int j = 0; j < column1; j++)
                        {
                            System.out.printf("%d\t",result[i][j]);
                        }
                        System.out.println();
                    }
                    
                }
                else{
                    System.out.println("The sizes of the two matrices has to be equal for addition to be possible");
                }
                break;
            case 2: //Multiplying matrices
                if(column1 == row2)
                {
                    result = new int[row1][column2];
                    for(int i = 0; i < row1; i++)
                    {
                        for(int j = 0; j < column1; j++)
                        {
                            result[i][j] = 0;
                            for(int t = 0; t < row1; t++)
                            {
                                result[i][j] = result[i][j] + Matrice1[i][t] * Matrice2[i][t];
                            }
                        }
                    }
                }
                else{
                    System.out.println("The multiplication is impossible,Please check the size of your Matrix");
                }
                break;
            default:
                System.out.println("The option you chose might've be wrong!");
        }
        
    }
}

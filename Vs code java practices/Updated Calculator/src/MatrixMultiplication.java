import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrixMultiplication {
    Scanner scanner;
    int[][] result ;   
    public MatrixMultiplication()
    {

    }
    //Trying to multiply two matrices
    public void MatriceOp()
    {
        scanner = new Scanner(System.in);
        int row1,column1,row2,column2,Option;
        int[][] Matrice1,Matrice2;
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
    public void SingleMatrice()
    {
        int columns,rows,option;
        Integer[][] Matrice;
        rows = Integer.parseInt(JOptionPane.showInputDialog("How many rows does your matrice have"));
        columns = Integer.parseInt(JOptionPane.showInputDialog("How many columns does your matrice have"));
        Matrice = new Integer[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.printf("Matrice[%d][%d] = ",i,j);
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.printf("%d\t",Matrice[i][j]);
            }
            System.out.println();
        }
        System.out.println("What Operation do you want to perform on this matrcie:\n1.Finding a determinant\n2.");//Add more Operations!
        option = scanner.nextInt();
        switch (option) {
            case 1:
                //Perform the determinant calculation! or call the determinant calculating method!
                break;
        
            default:
                break;
        }
    }
    public void displayMatrice(int[][] matrice,int rows,int column)
    {
        for(int i = 0; i < rows; i++)//This for loop is for printing the results.
                    {
                        for(int j = 0; j < column; j++)
                        {
                            System.out.printf("%d\t",result[i][j]);
                        }
                        System.out.println();
                    }
    }
    public void displayTranspose(int matrices[][],int row, int column)
    {
        System.out.println("__________________________");
        System.out.println("The Transpose of your matrice:");
            for(int i = 0; i < column; i++)
            {
                System.out.printf("|");
                for(int j = 0; j < row; j++)
                {
                    System.out.printf("%d\t",matrices[j][i]);
                }
                System.out.printf("|\n");
            }
    }
    public void ScalarMultiplication()
    {
        //Enter the matrice
        Integer[][] Matrice;
        int No_Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter the rows in your Matrice"));
        double Scalarnumber;
        Integer columns = Integer.parseInt(JOptionPane.showInputDialog("How many columns does your matrice have"));
        Matrice = new Integer[No_Rows][columns];
        for(int i = 0; i < No_Rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.printf("Matrice[%d][%d] =",i,j);
                Matrice[i][j] = scanner.nextInt();
                scanner.nextLine(); 
            }
        }
        System.out.println("Enter the Scalar number to multiply with:");
        Scalarnumber = scanner.nextDouble();
        for(int i = 0; i < No_Rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                Matrice[i][j] = (int)Math.round(Scalarnumber*Matrice[i][j]);
            }
        }
        for(int i = 0; i < No_Rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.printf("%d\t",Matrice[i][j]);
            }
            System.out.println();
        }
    }
    public void displaysize()
    {

    }
    public double determinant(int Matrix[][], int column, int row )
    { 
        //Initialise arrays to store the resulting Matrix system relative to the size of the original matrix
        //if you have a 3x3 matrix then there will be 3 different matrix systems formed but their lengths would be row-1,column-1
        for(int i = 0; i < row; i++ )
        {
            //declare matrix systems array1,array2,array3... depending on the number of matrix systems available!
        }
        if(row == column)
        {
            if(Matrix.length == 1)
            {
                return Matrix[0][0];
            }
            else if(Matrix.length == 4)
            {
                return Matrix[0][0] * Matrix[1][1] - Matrix[0][1] * Matrix[1][0];
            }
            else{//Using a 3x3 matrix as an example
                for(int i = 0; i < row; i++)// Assign the different matrix their data!
                {
                    for(int j = 0; j < column; j++)
                    {
                        if(j == i)
                        {
                            continue;//Skip the matrix whereby
                        }
                        else if(i == 0) //Because we are always taking in the first row as an index
                        {
                            continue;//Skip the iteration for this case!
                            //This is to ignore the first row always
                        }
                    }
                }
            }
        }
        return 1.0;//This should be changed to return a determinant
    }
}

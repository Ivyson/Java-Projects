#include <stdio.h>
int fact(int number)
{
    int factorial;
    factorial = 1;
    if(number == 0 || number == 1)
    {
        return 1;
    }
    else if(number < 0)
    {
        return 0; 
    }
    for(int i = 1; i <= number; i++)
    {
        factorial = factorial*i;
    }
    return factorial;
}
int main()
{
    int number;
    
    printf("Find the factorial of:");
    scanf("%d",&number);
    int factorial = fact(number);
    if(factorial == 0)
    {
        printf("A factorial of a negative number does not exist");
        return 0;
    }
    else
    printf("The factorial of %d is : %d",number,factorial);
}
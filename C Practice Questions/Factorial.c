#include <stdio.h>
int fact(int number)
{
    int factorial;
    factorial = 1;
    for(int i = 1; i <= number; i++){
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
    printf("The factorial of %d is : %d",number,factorial);
}
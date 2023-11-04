#include <stdio.h>

int main()
{
    int first_num,second_number,last_number,num_terms;
    last_number = 0;
    printf("How many Numbers must your sequence have?");
    scanf("%d",&num_terms);
    printf("What is your first value:");
    scanf("%d",&first_num);
    for(int i = 0; i < num_terms; i++)
    {
        second_number = first_num + last_number;
        first_num = last_number;
        last_number = second_number;
        printf("%d\t",second_number);
        
    }
}
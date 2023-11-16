#include <stdio.h>
//Recursive function
int main() {
    int first_num,sec_num,next_num,num_terms;
    sec_num = 0;
    printf("How many terms must your sequence have?:");
    scanf("%d",&num_terms);
    printf("Enter The first number: ");
    scanf("%d",&first_num);
    next_num = first_num ;
    for(int i = 0; i < num_terms;  i++)
    {
       
       next_num = sec_num + first_num;
       first_num = sec_num;
       sec_num = next_num;
       printf("%d\t",next_num);


    }
}
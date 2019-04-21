#include<stdio.h>
int main()
{
 int num , third , first, sum;
  scanf("%d",&num);
  third = ((num)%10);
  first= (num)/100;
  sum = third+first;
  printf("%d", sum);
  
}
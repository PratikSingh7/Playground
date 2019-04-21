#include<stdio.h>
int main()
{
  int num, sum , d1 , d2;
  scanf("%d",&num);
 d2= (num)%10;
  d1=(num)/10;
  sum = d1+d2;
  printf("%d", sum);
  return 0;
}
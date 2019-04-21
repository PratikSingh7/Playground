#include <stdio.h>
int main() {
	int n , row , col , space;
   int num=1;
  scanf("%d",&n);
  for(row=1 ; row<=n ; row++)
  {
   for(space=1 ; space<=(n-row) ; space++)
   {
   printf(" ");
   }
    for(col=1 ; col<=row ; col++)
    {
    printf("%d ",num);
      num++;
    }
    printf("\n");
  }
}
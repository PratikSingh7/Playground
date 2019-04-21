#include <stdio.h>
int main() {
	int n , row , col , space;
  scanf("%d",&n);
  for(row=1 ; row<=n ;row++)
  {
  for(space=1 ;space<=(n-row) ; space++)
  {
  printf(" ");
  }
   for(col=1 ; col<= (row+(row-1)) ;col++)
   {
   printf("*");
   }
    printf("\n");
  }
	
}
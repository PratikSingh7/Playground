#include <stdio.h>
int main() {
	int n , row , col , space , num1 , num2 ;
  scanf("%d",&n);
   for(row=1 ; row<=n ; row++)
  {
   if(row%2!=0)
      {
      for(col=1 ; col<=(n-1) ; col++)
      {
        printf("%d",row);
      }
     num1=row+1;
     printf("%d",num1);
   }
     else{
     num2=row+1;
       printf("%d",num2);
       for(col=2 ; col<=n; col++)
       {
       printf("%d",row);
       }
     }
     printf("\n");
  }
}
  

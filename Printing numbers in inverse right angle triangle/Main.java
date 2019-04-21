
#include <stdio.h>
int main() {
    int n , row , col ;
  scanf("%d",&n);
  for(row=1 ; row<=n ; row++)
  {
    int num=(n-(row-1));
  for(col=1 ; col<=(n-(row-1)) ; col++)
  {
  printf("%d",num);
    num=num-1;
  }
    printf("\n");
  }
}

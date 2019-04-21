#include<stdio.h>
int prime(int m);
int main(){
    int n ;
  scanf("%d",&n);
  prime(n);
}
int prime(int m)
{
  int i,j;
  for(i=1; i<=m; i++)
    {
        int fact=0;
        for(j=1; j<=m; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
            printf("%d\n" ,i);
    }
}
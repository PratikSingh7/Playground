#include<stdio.h>
 int sum(int m)
 {
  int count,sum=0;
   for(count=1 ; count<=m ; count++)
   {
     sum=sum+count;
   }
   return sum;
 }
int main() {
    int n,ans;
  scanf("%d",&n);
  ans=sum(n);
  printf("%d",ans);
}
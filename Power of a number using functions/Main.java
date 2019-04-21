#include<stdio.h>
void power(int m1 , int m2);
int main(){
    int n1 , n2 ;
   scanf("%d %d",&n1,&n2);
    power(n1,n2);
}
void power(int m1 , int m2)
 {
  int count=1;
   while(m2>0)
   {
    count=count*m1;
     m2--;
   }
   printf("%d",count);
 }
#include <stdio.h>
int main(){
    int num,r,sum=0,temp;
    scanf("%d",&num);
    for(temp=num;num!=0;num=num/10){
         r=num % 10;
         sum=sum+(r*r*r);
    }
    if(sum==temp)
         printf("Armstrong Number");
    else
         printf("Not an Armstrong Number");

}

#include<stdio.h>
int main()
{
 int n,i,num=0;
 scanf("%d",&n);
  int arr[n];
  for(i=0 ; i<n ; i++)
  {
  scanf("%d",&arr[i]);
  }
  for(i=0 ; i<n ;i++)
  {
   if(arr[i]>num)
   {
   num=arr[i];
   }
  }
      printf("%d",num);
}

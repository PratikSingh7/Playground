// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int n , i ,num ;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);  
  } 
  for(i=0;i<n;i++)
  {
    if(a[i]>a[i+1])
    {
    num=i+1;
    }
    else
    {
    num=i;
    } 
  }
  printf("%d",num); 
}
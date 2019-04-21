
#include<stdio.h>
int main()
{
 int n,search_elem_1 , search_elem_2,i,found1=0,found2=0,n1,n2;
 scanf("%d",&n);
  int arr[n];
  for(i=0 ; i<n ; i++)
  {
  scanf("%d",&arr[i]);
  }
  scanf("%d",&search_elem_1);
  scanf("%d",&search_elem_2);
  for(i=0 ; i<=n ; i++)
  {
   if(arr[i]==search_elem_1 )
   {
    found1=1;
     n1=i;
   }
    if(arr[i]==search_elem_2)
   {
    found2=1;
      n2=i;
      break;
   }
  }
  if(found1==1)
  {
  printf("%d\n",n1);
  }
  else{
  printf("-1");
  }
    if(found2==1)
  {
  printf("%d\n",n2);
  }
  else{
  printf("-1");
  }
}
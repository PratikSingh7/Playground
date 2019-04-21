#include <stdio.h>
int great(int p,int q,int r);
int main(){
int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  great(a,b,c);
}
int great(int p , int q,int r)
{
     if(p>=q && p>=r)
     {
      printf("%d",p);
     }
   else if(q>=p && q>=r)
   {
   printf("%d",q);
    }
  else{
  printf("%d",r);
  }
}
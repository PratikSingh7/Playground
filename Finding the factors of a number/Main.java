#include <stdio.h>
int main() {
	int n , count;
  scanf("%d",&n);
  for(count=1 ; count <=n ;count++)
  {
  if(n%count==0)
  {
  printf("%d\n",count);
  }
  }
	return 0;
}
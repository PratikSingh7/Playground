#include<stdio.h>
int main()
{
  int length = 6 , breadth =9 , peri , area;
  peri = 2*(length + breadth);
  area =length * breadth;
  printf("The perimeter of the rectangle is: %d cm\n", peri);
  printf("The area of the rectangle is: %d sq cm", area);
  return 0;
}
#include <stdio.h>
 
void main()
{
    long num, temp, digit, sum = 0;
 
    scanf("%ld", &num);
    temp = num;
    while (num > num%10)
    {
        digit = num % 10;
        num /= 10;
    }
    printf(" %ld\n",digit);
}
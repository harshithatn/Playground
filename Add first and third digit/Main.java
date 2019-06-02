#include<stdio.h>
int main()
{
  int n,sum=0,digit,first,third;
  scanf("%d \n",&n);
  third=n % 10;
  digit=log10(n);
  first=(n / pow(10,digit));
  sum=first + third;
  printf("%d \n",sum);
  return 0;
}
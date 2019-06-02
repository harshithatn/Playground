#include<stdio.h>
int main()
{
  int n,first,last;
  scanf("%d \n",&n);
  first=n/10;
  last=first%10;
  printf("%d \n",last);
  return 0;
}
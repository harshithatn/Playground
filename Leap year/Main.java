#include<stdio.h>
int main()
{
  int year;
  scanf("%d \n",&year);
  if((year%400)==0)
  {
    printf("%d is a leap year \n", year);
  }
  else if((year%100)==0)
  {
    printf("%d is not a leap year \n",year);
  }
  else if((year%4)==0)
  {
    printf("Leap year \n",year);
  }
  else
  {
    printf("Not Leap year \n",year);
  }
  return 0;
}
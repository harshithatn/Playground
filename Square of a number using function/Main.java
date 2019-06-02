#include<stdio.h>
int square (int);
void main() {
   int no,ans;
  scanf("%d",&no);
  ans=square(no);
  printf("%d",ans);
}
int square(int n)
{
  return(n*n);
}
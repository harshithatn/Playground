#include <stdio.h>
int main() {
	int n,x;
  scanf("%d",&n);
  for(x=1;x<=n;x++)
  {
    if(n%x==0)
    {
      printf("%d \n",x);
    }
  }
	return 0;
}

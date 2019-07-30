#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n,x;
  scanf("%d",&n);
  if(n%2 ==0)
  {
    x = pow(3,(n-1)/2);
    printf("%d",x);
  }
  else 
  { 
    x = pow(2,n/2);
    printf("%d",x);
  }
  return 0;
}
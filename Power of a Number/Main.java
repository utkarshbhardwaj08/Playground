#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here    
  int base,exp,sol;
  scanf("%d",&base);
  scanf("%d",&exp);
  if(exp<0)
    printf("Wrong input");
  else
  {
  sol = pow(base,exp);
  printf("%d",sol);
  }
    return 0;
}
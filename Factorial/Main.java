#include<stdio.h>
int main()
{
	//your code here
  long int n,fact=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
    fact = fact*i;
  printf("%ld",fact);
}
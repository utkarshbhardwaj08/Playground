#include<stdio.h>
int gcd(int,int);
int main()
{
  //Type your code here
  int a,b,lcm;
  scanf("%d %d",&a,&b);
  lcm = (a*b)/gcd(a,b);
  printf("%d",lcm);
  return 0;
}
int gcd(int a,int b)
{
  if(a==0)
    return b;
   else if(b==0)
     return a;
   else
     return gcd(b,a%b);
}
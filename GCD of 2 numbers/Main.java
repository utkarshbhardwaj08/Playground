// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int gcd(int,int);
int main()
{
  // Enter your code here 
  int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  printf("%d",gcd(a,b));
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
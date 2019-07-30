#include<stdio.h>
int main()
{
  //Type your code here
  int n,t1=0,t2=1,next_term;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    printf("%d ",t1);
    next_term = t1+t2;
    t1 = t2;
     t2 = next_term;
  }
  return 0;
}
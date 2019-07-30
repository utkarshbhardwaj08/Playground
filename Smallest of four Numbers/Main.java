#include<stdio.h>

int main()
{
  // Type your code here
  int min,num;
  scanf("%d",&num);
  min = num;
  for(int i=0;i<3;i++)
  {
    scanf(" %d",&num);
    if(num<min)
     min=num;
  }
  printf("%d",min); 
  }
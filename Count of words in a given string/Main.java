#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int n=1,i=0;
  char str[100];
  gets(str);
  for(i=0;i<strlen(str);i++)
  {
    if(str[i] == ' ')
      n++;
  }
  printf("%d",n);
}
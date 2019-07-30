#include<stdio.h>
int main()
{
  //Type your code here
  int n,num,i=0,flag=0,loc;
  int arr[100];
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  scanf("%d",&num);
  for(i=0;i<n;i++)
  {
    if(arr[i]==num)
    {
      flag=1;
      loc=i+1;
      break;
    }
  }
if(flag==1)
  printf("%d",loc); 
else
  printf("%d isn't present in the array.",num);
  return 0;
}
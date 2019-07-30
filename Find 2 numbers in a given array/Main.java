#include<stdio.h>
int main()
{
  	//type your code here
  int f1=0,f2=0,i=0;
  int n,a[100],n1,n2,i1,i2,c1=1,c2=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&n1);
scanf("%d",&n2);
  for(i=0;i<n;i++)
  {
    if(a[i]==n1 && c1==1)
    {
      i1=i;
      f1=1;
      c1=0;
    }
    if(a[i]==n2 && c2==1)
    {
      i2=i;
      f2=1;
      c2=0;
    }
  }
 if(f1==1)
printf("Element 1 index = %d\n",i1);
else
printf("Element 1 index = -1\n");
if(f2==1)
printf("Element 2 index = %d\n",i2);
else
printf("Element 2 index = -1\n");
return 0;
}
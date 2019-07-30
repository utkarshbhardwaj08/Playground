#include <stdio.h>
int main() {
	// Type your code here
  char ch;
  scanf("%c",&ch);
  if(isupper(ch))
    printf("%c",tolower(ch));
  if(islower(ch))
    printf("%c",toupper(ch));
	return 0;
}
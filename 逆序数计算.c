#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
printf("Input x:\n");
int x,y,a,b;
scanf( "%d",&x);
if (x<0)
    x=-x;
int f,g,c,d,e;
f=x/1000;
g=(x-f*1000)/100;
c=(x-f*1000-g*100)/10;
d=x-f*1000-g*100-c*10;
y=d*1000+c*100+g*10+f;
a=d*10+c;
b=g*10+f;
e=pow(a,2)+pow(b,2);
printf("y=%d\n",y);
printf("a=%d,b=%d\n",a,b);
printf("result=%d\n",e);
return 0;
}



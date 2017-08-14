import java.io.*;
import java.util.*;
class primeinterval
{
public static void main(String s[])
{
int low,high,i,flag;
Scanner sc=new Scanner(System.in);
System.out.println("enter the low value");
low=sc.nextInt();
System.out.println("enter the high value");
high=sc.nextInt();
while(low<high)
{
flag=0;
for(i=2;i<=low/2;++i)
{
if(low%i==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(low);
++low;
}}
}
}

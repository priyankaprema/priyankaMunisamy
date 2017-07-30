import java.io.*;
import java.util.*;
class prime
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int num,i=0,flag;
System.out.println("enter number");
num=sc.nextInt();
for(i=2;i<num/2;++i)
{
if(num%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("prime number");
else
System.out.println("not a prime number");
}
}


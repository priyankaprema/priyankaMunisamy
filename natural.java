import java.io.*;
import java.util.*;
class natural
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n,i=0;
int sum=0;
System.out.println("enter the n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("sum of "+n+" natural numbers is"+sum);
}
}

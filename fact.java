import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
int n,a=0,b=1,c;
Scanner sc=new Scanner(System.in);
Sytem.out.println("enter the number of series");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}

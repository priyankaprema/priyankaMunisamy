import java.io.*;
import java.util.*;
class count
{
public static void main(String s[])
{
int count1=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer");
n=sc.nextInt();
while(n!=0)
{
n=n/10;
count1=count1+1;
}
System.out.println("the count value is"+count1);
}
}

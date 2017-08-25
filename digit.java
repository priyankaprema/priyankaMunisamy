import java.io.*;
import java.util.*;
class digit
{
public static void main(String args[])
{
int a,num,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
System.out.println("reversed number is:");
while(num!=0)
{
a=num%10;
System.out.print(a);
num=num/10;
}
}
}

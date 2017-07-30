import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String s[])
{
Scanner sc= new Scanner(System.in);
int a,b=0,num;
int temp;
System.out.println("enter the number");
num=sc.nextInt();
temp=num;
while(num>0)
{
a=num%10;
b=b*10+a;
num=num/10;
}
if(temp==b)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}

import java.io.*;
import java.util.*;
class eveninterval
{
public static void main(String s[])
{
int startvalue,endvalue,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the startvalue");
startvalue=sc.nextInt();
System.out.print("enter the endvalue");
endvalue=sc.nextInt();
for(i=startvalue;i<=endvalue;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}}

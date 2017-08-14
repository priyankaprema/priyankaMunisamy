import java.io.*;
import java.util.*;
class odd
{
public static void main(String s[])
{
int startvalue,endvalue;
Scanner sc=new Scanner(System.in);
System.out.println("enter the startvalue");
startvalue=sc.nextInt();
System.out.println("enter the endvalue");
endvalue=sc.nextInt();
for(i=startvalue;i<=endvalue;i++)
{
if((i%2)!=0)
{
System.out.println(i);}
}
}
}

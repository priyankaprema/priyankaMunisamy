import java.io.*;
import java.util.*;
class vow
{
public static void main(String args[])
{
int count=0;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
s=sc.next();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
{
count=count+1;
}
}
System.out.println(count);
}
}

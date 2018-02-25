import java.io.*;
import java.util.*;
class reverse
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
if(n.length()>=1&&n.length()<=10000)
{
String s2[]=n.split(" ");
for(int i=0;i<s2.length;i++)
{
int v=s2[i];
for(int j=v.length()-1;j>=0;j--)
{
System.out.print(v.charAt(j));
}
System.out.print(" ");
}
}
else
{
System.out.println("invalid string");
}
}
}

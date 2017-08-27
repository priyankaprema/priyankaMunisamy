import java.io.*;
import java.util.*;
class camel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String str=sc.nextLine();
String result="";
char firstchar=str.charAt(0);
result=result+character.toUpperCase(firstchar);
for(int i=1;i<str.length();i++)
{
char currchar=str.charAt(i);
char prevchar=str.charAt(i-1);
if(prevchar==' ')
{
result=result+character.toUpperCase(currchar);
}
else
{
result=result+character.toLowerCase(currchar);
}
}
System.out.println(result);
}
}


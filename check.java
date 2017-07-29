import java.io.*;
import java.util.*;
class check
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println("entered character is an alphabet");
}
else
{
System.out.println("character is not an alphabet");
}
}
}

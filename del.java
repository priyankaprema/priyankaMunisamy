import java.io.*;
import java.util.*;
class del
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
String s1=Integer.toString(n);
int n1=Integer.parseInt(s1.substring(m));
System.out.println(n1);
}
}

import java.io.*;
import java.util.*;
class leap
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int year;
System.outprintln("enter the year");
year=sc.nextInt();
if(year%400==0)
{
System.out.println("leap year");
}
else if(year%100==0)
{
System.out.println("not a leap year");
}
else if(year%4==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");}
}
}

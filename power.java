import java.io.*;
import java.util.*;
class power
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int base,exponent,result=1;
System.out.println("enter the base value");
base=sc.nextInt();
System.out.println("enter the exponent value");
exponent=sc.nextInt();
while(exponent!=0)
{
result=result*base;
--exponent;
}
System.out.println("power of a number is "+result);
}
}

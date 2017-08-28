import java.io.*;
import java.util.*;
class simple
{
public static void main(String args[])
{
float p,r,t,si;
Scanner sc=new Scanner(System.in);
System.out.println("enter principal amount");
p=sc.nextFloat();
System.out.println("enter Rate of interest");
r=sc.nextFloat();
System.out.println("enter time period");
t=sc.nextFloat();
si=(p*t*r)/100;
System.out.println("simple interest is"+"\t"+si);
}
}

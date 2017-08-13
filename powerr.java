import java.io.*;
import java.util.*;
class power
{
public static void main(String s[])
{
int exponent;
float base,result=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the  base and exponent");
base=sc.nextFloat();
exponent=sc.nextInt();
System.out.println(base+"^"+exponent+"=");
while(exponent!=0)
{
result*=base;
--exponent;
}
System.out.println(result);
}
}


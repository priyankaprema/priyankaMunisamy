import java.io.*;
import java.util.*;
class sum
{
public static void main(String s[])
{
int n,sum=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter N value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("sum of N is"+sum);
}
}


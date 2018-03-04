import java.io.*;
import java.util.*;
class desec
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
if(n>=1&&n<=100000)
{
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
int m,k,j;
for(k=0;k<n;k++)
{
for(j=k+1;j<n;)
{
if(a[j]==a[k])
{
for(m=j;m<n;m++)
{
a[m]=a[m+1];
}
n--;
}
else
j++;
}
}
for(int l=a.length-1;l>=0;l--)
System.out.print(a[l]);
}
else System.out.println("Invalid");
}
}

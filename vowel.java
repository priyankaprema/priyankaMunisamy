import java.io.*;
import java.util.*;
class vowel
{
public static void main(String s[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
{
System.out.println("entered character is a VOWEL");
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println("entered character is a CONSONANT");
}
else {
System.out.println("not an alphabet");
}
}
}

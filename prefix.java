class prefix
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int i=0,j=0,m,n,k=0;
   String s,s1;
   s=sc.next();
   s1=sc.next();
   m=s.length();
   n=s1.length();
    if((m>=1&&m<=100000)&&(n>=1&&n<=100000))
      {
        for(i=0;i<m;i++)
         {        k=0;
       for(j=i;j<=i;j++)
         {      
          if(s.charAt(i)==s1.charAt(j))
            {    k=1;
         System.out.print(s.charAt(i));
             }
             }
       if(k==0)
        {
        break;
         }
 }
   } 
   }
}


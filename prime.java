import java.io.*;
import java.util.*;
class prime
{
public static void main (String args[])
{
int i,n,c=0;
Scanner s=new Scanner(System.in);
System.out. println("enter the number");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n%1==0)
{
c++;
}
}
if (c==2)
{
System.out.println(" prime");
}
else
{
System.out.println("not a prime");
}
}
}

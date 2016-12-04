import java.io.*;
class Prime
{
public static void main(String args[])
{
int i,n,rem,flag=0;
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the number:");
n=Integer.parseInt(in.readLine());
for(i=2;i<n/2;i++)
{
rem=n%i;
if(rem==0)
flag=1;
}
if(flag==1)
{
System.out.println("The given number is not prime");
}
else
{
System.out.println("The given number is prime");
}
}
catch(Exception e)
{
}
}
} 

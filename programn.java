import java.io.*;
import java.net.*;
import java.util.*;
public class table2
{
public static void main(String args[])
{
int a,i;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in)
a=sc.nextInt();
for(i=0;i<=100;i++)
{
System.out.println(a+"*"+i+"="+i*a);
}
}
}

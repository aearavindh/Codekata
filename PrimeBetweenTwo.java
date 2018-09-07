import java.util.Scanner;

public class PrimeBetweenTwo
{
public static void main(String args[])
{
int a,b,i,j,count=0;
Scanner in = new Scanner(System.in);
a = in.nextInt();
b = in.nextInt();
for(i=a+1;i<b;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.print(i+" ");
}
}
}

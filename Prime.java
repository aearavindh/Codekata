import java.util.Scanner;

public class Prime
{
public static void main(String args[])
{
int num,i,count=0;
Scanner in = new Scanner(System.in);
num = in.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
count++;
}
if(count==2)
System.out.println("Yes");
else
System.out.println("No");
}
}

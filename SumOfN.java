import java.util.Scanner;

public class SumOfN
{
public static void main(String args[])
{
int i,n,sum=0;
Scanner in = new Scanner(System.in);
n = in.nextInt();
for(i=1;i<=n;i++)
sum+=i;
System.out.println(sum);
}
} 

import java.util.Scanner;

public class SumOfFirstK
{
public static void main(String args[])
{
int i,n,k,sum=0;
Scanner in = new Scanner(System.in);
n = in.nextInt();
k = in.nextInt();
int a[] = new int[n];
for(i=0;i<n;i++)
a[i]=in.nextInt();
for(i=0;i<k;i++)
sum+=a[i];
System.out.println(sum);
}
} 

import java.util.Scanner;

public class Factorial
{
public static void main(String args[])
{
int num,i,sum=1;
Scanner in = new Scanner(System.in);
num = in.nextInt();
for(i=1;i<=num;i++)
sum*=i;
System.out.println(sum);
}
}


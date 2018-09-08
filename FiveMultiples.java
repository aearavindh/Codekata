import java.util.Scanner;

public class FiveMultiples
{
public static void main(String args[])
{
int num,i;
Scanner in = new Scanner(System.in);
num = in.nextInt();
for(i=1;i<=5;i++)
System.out.print(num*i+" ");
}
}


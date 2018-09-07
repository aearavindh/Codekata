import java.util.Scanner;

public class Power
{
public static void main(String args[])
{
int i,num,a=1,pow;
Scanner in = new Scanner(System.in);
num = in.nextInt();
pow = in.nextInt();
for(i=0;i<pow;i++)
a*=num;
System.out.println(a);
}
}

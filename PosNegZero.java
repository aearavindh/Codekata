import java.util.Scanner;

public class PosNegZero
{
public static void main(String args[])
{
int num;
Scanner in = new Scanner(System.in);
num = in.nextInt();
if(num>0)
System.out.println("Positive");
else if(num<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
}
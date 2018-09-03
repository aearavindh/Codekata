import java.util.Scanner;

public class PosNegZero
{
public static void main(String args[])
{
int num;
System.out.println("Enter the number:");
Scanner in = new Scanner(System.in);
num = in.nextInt();
if(num>0)
System.out.println(num+" is a positive number");
else if(num<0)
System.out.println(num+" is a negative number");
else
System.out.println(num+" is zero");
}
}
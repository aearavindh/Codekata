import java.util.Scanner;

public class OddEven
{
public static void main(String args[])
{
int num;
System.out.println("Enter the number:");
Scanner in = new Scanner(System.in);
num = in.nextInt();
if(num%2==0)
System.out.println(num+" is even number");
else
System.out.println(num+" is odd number");
}
}
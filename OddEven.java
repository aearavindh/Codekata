import java.util.Scanner;

public class OddEven
{
public static void main(String args[])
{
int num;
Scanner in = new Scanner(System.in);
num = in.nextInt();
if(num<0)
System.out.println("Invalid");
elseif(num%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}
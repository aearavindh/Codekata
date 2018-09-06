import java.util.Scanner;

public class LeapOrNot
{
public static void main(String args[])
{
int year;
Scanner in = new Scanner(System.in);
year = in.nextInt();
if(year%4==0)
System.out.println("Yes");
else
System.out.println("No");
}
}
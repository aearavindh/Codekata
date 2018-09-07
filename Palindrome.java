import java.util.Scanner;

public class Palindrome
{
public static void main(String args[])
{
int num,dup,rev=0,i;
Scanner in = new Scanner(System.in);
num = in.nextInt();
dup = num;
while(num>0)
{
i = num%10;
rev = rev*10+i;
num/=10;
}
if(dup==rev)
System.out.println("Yes");
else
System.out.println("No");
}
}

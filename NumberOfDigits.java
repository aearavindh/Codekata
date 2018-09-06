import java.util.Scanner;

public class NumberOfDigits
{
public static void main(String args[])
{
int num,count=0;
Scanner in = new Scanner(System.in);
num = in.nextInt();
do
{
count++;
num/=10;
}while(num!=0);
System.out.println(count);
}
} 

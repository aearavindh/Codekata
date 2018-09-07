import java.util.Scanner;

public class OddNumbers
{
public static void main(String args[])
{
int a,b;
Scanner in = new Scanner(System.in);
a = in.nextInt();
b = in.nextInt();
for(a=a+1;a<b;a++)
{
if(a%2!=0)
System.out.print(a+" ");
}
}
}

import java.util.Scanner;

public class Armstrong
{
public static void main(String args[])
{
int num,dup,i,sum=0;
Scanner in = new Scanner(System.in);
num = in.nextInt();
dup = num;
while(num>0)
{
i = num%10;
sum+=i*i*i;
num = num/10;
}
if(sum==dup)
System.out.println("Yes");
else
System.out.println("No");
}
}


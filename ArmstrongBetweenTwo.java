import java.util.Scanner;

public class ArmstrongBetweenTwo
{
public static void main(String args[])
{
int num,n1,n2,dup,i,j,sum=0;
Scanner in = new Scanner(System.in);
n1 = in.nextInt();
n2 = in.nextInt();
for(j=n1+1;j<n2;j++)
{
dup = num =j;
sum = 0;
while(num>0)
{
i = num%10;
sum+=i*i*i;
num = num/10;
}
if(sum==dup)
System.out.print(dup+" ");
}
}
}


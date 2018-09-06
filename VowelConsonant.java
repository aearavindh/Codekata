import java.util.Scanner;

public class VowelConsonant
{
public static void main(String args[])
{
char ch;
Scanner in = new Scanner(System.in);
ch = in.next().charAt(0);
if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
{
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
System.out.println("Vowel");
else
System.out.println("Consonant");
}
else
System.out.println("Invalid");
}
}
import java.util.Scanner;
class Replace
{
	static void str(String str)
	{
		return (str.replace('K','n'));;
	}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
str(str);
}
}
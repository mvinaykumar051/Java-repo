class Calculation
{
static void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}
static void sub(int a,int b)
{
int c=a-b;
System.out.println(c);
}
static void div(int a,int b)
{
int c=a/b;
System.out.println(c);
}
static void mul(int a,int b)
{
int c=a*b;
System.out.println(c);
}
public static void main(String[] args)
{
add(2,3);
sub(4,2);
div(20,2);
mul(5,5);
}
}
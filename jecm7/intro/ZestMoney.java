class ZestMoney
{
static void signup()
{
System.out.println("Signing in");
}
static void homePage()
{
System.out.println("Home Page");
}
public static void main(String[] args)
{
signup();
login();
homePage();
applyLoan();
logout();
}
static void login()
{
System.out.println("Logining in");
}
static void applyLoan()
{
System.out.println("Loan applied");
}
static void logout()
{
System.out.println("logging out");
}
}
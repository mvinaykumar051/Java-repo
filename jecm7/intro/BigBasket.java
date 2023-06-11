class BigBasket
{
static void signup()
{
System.out.println("Signing in");
}
static void addProduct()
{
System.out.println("Product added");
}
public static void main(String[] args)
{
signup();
login();
addProduct();
payment();
logout();
}
static void login()
{
System.out.println("Logining in");
}
static void payment()
{
System.out.println("Payment done");
}
static void logout()
{
System.out.println("logging out");
}
}
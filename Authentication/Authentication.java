import java.util.Scanner;
class InvalidUserException extends Exception
{
public InvalidUserException(String msg)
{
super(msg);
}
}
public class Authentication
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter user name    :");
String username=sc.nextLine();
System.out.print("Enter password     :");
String password=sc.nextLine();
try{
	if(username.length()<8)
	//exception whenusername character length lessthan 8 
	throw new InvalidUserException( "Invalid username,username must be  greater than 7 characters !" );
	else if(password.equals("jibin123"))
	{
	throw new InvalidUserException("Incorrect password,please enter correct password");
	}
	else
	{
	System.out.println("Login successful");
	}
	}
	catch(InvalidUserException e)
	{
	e.printStackTrace();
	}
	}
	}
	

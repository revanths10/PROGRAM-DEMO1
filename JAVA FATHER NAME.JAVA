import java.util.Scanner;

class Family
{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your father name : ");
String str1 = scanner.next();
System.out.println("Enter your mother name : ");
String str2 = scanner.next();
System.out.println("Age : ");
int myInt1 = scanner.nextInt();
System.out.println("Salary :");
float salary = scanner.nextFloat();
System.out.println("Phone Number : ");
int myInt2 = scanner.nextInt();
System.out.println("City : ");
String str3 = scanner.next();
System.out.println("State : ");
String str4 = scanner.next();
System.out.println("Country : ");
String str5 = scanner.next();
System.out.println("Your father name :  "+str1);
System.out.println("Your mother name :  "+str2);
System.out.println("Age :  "+myInt1);
System.out.println("Salary : "+salary);
System.out.println("Phone Number :  "+myInt2);
System.out.println("Address");
System.out.println(str3);
System.out.println(str4);
System.out.println(str5);
}
}

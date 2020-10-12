import java.util.Scanner;
import java.util.Date;
public class Employee {
	private static Scanner sc;
	public static void main(String[] args) 
	{
	    String name;
int Dob,Mob,Yob,salary;
Date dateOfBrth;
		sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Details of Employee ");
System.out.println(" Please Enter Your Name  : ");
		name = sc.nextLine();
System.out.println(" Please Enter Your date of Birth  : ");	
		Dob = sc.nextInt();
System.out.println(" Please Enter Your Month of Birth  : ");	
		Mob = sc.nextInt();
System.out.println(" Please Enter Your Year of Birth  : ");	
		Yob = sc.nextInt();
System.out.print(" Please Enter Your Yearly Salary : ");	
		salary = sc.nextInt();	

		
	System.out.println("Your Name is "+name);
System.out.println("Your Date of Birth is "+Dob);
System.out.println("Your Month of Birth is "+Mob);
System.out.println("Your Year of Birth is "+Yob);

System.out.println("Your Date of Birth is"+Dob+"-"+Mob+"-"+Yob );
if(salary>=500000)
{
System.out.println("Tax is 20%");
}
if(salary>=400000&&salary<500000)
{
System.out.println("Tax is 15%");
}
if(salary>=300000&&salary<=400000)
{
System.out.println("Tax is 10%");
}
if(salary<=200000)
{
System.out.println("Tax is 10%");
}


}
}

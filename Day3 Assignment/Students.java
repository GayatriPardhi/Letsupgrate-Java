import java.util.Scanner;
public class Students {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, Percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks ");
System.out.print(" Please Enter the English marks  : ");
		english = sc.nextInt();
System.out.print(" Please Enter the Chemistry marks  : ");	
		chemistry = sc.nextInt();
System.out.print(" Please Enter the Computers marks  : ");	
		computers = sc.nextInt();
System.out.print(" Please Enter the Physics marks  : ");	
		physics = sc.nextInt();
System.out.print(" Please Enter the Maths marks  : ");	
		maths = sc.nextInt();	
		total = english + chemistry + computers + physics + maths;
		
	    Percentage = (total / 500) * 100;
     System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
if(Percentage>75)
{
 System.out.println(" Grade A");
}
if(Percentage<=75&&Percentage>=60)
{
 System.out.println(" Grade B");
}
if(Percentage<=59&&Percentage>=35)
{
 System.out.println(" Grade C");
}
if(Percentage<=34)
{
 System.out.println(" Grade D");
}

	
	}
}

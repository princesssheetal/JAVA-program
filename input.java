import java .util.Scanner;
class input
{
	public static void main (String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id ,name,sal:");
		int id=sc.nextInt();
		String name=sc.next();
		float sal=sc.nextFloat();
		
		
		System.out.println("no is : "+id);
		System.out.println("name: "+name);
		System.out.println("salary : "+sal);
	
	} 
}
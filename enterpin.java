import java .util.Scanner;
 class enterpin
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int pin = 1111;
		
		System.out.println("enter your pin");
		int n =sc.nextInt();
		
		while (n != pin)
		{
			
		System.out.println(" try again enter your pin");
		n =sc.nextInt();
		}
		
		System.out.println("pin accepted");
	}
}
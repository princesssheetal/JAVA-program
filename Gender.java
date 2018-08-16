import java.util.Scanner;
class Gender
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" WHAT IS YOUR GENDER (M OR F)?");
		char c=sc.next().charAt(0);
		System.out.println(" ENTER FIRST NAME");
		String first=sc.next();
		System.out.println(" ENTER LAST NAME");
		String last=sc.next();
		System.out.println(" ENTER AGE");
		int n=sc.nextInt();
		char c1='F';
		char c2='M';
		char c3='Y';
		int d=c-c1;
		int d1=c-c2;
		char ans;
		
		if(n<20)
		{
			System.out.println(" Then i shall call you"+first+" "+last);
		}
		
		if(n>20 && d==0)
		{
		System.out.println(" ARE YOU MARRIED (Y OR N)?");
		ans=sc.next().charAt(0);
		int d2=ans-c3;		
		if(d ==0 && d2==0 )
		{
				System.out.println(" Then i shall call you Mrs"+last);	
		}
		else
			System.out.println(" Then i shall call you Ms"+last);
	}}
}
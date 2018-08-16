import java.util.Scanner;
class nim
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System .out.println("ENTER THE VALUE OF PILES A ,B,C");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		System .out.println("A: "+a+"  B :"+b+"  C: "+c);
		while((a > 0) || (b > 0) || (c > 0))
		{
			System .out.println("choose a pile: ");
			char n=sc.next().charAt(0);
			System .out.println("how many to remove from piles: ");
			int no=sc.nextInt();
			char q='A';
			char w='B';
			char e='C';
			int d=n-q;
			int d1=n-w;
			int d2=n-e;
			if(d==0)
			{
				a=a-no;
				System .out.println("A: "+a+"  B :"+b+"  C: "+c);
			}
			else if(d1==0)
			{
				b=b-no;
				System .out.println("A: "+a+"  B :"+b+"  C: "+c);
			}
			else
			{
				c=c-no;
				System .out.println("A: "+a+"  B :"+b+"  C: "+c);
			}
		}
		
	System .out.println("ALL PILES AREEMPTY. GOOD JOB!");

			
}
}		
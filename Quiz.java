import java.util.Scanner;
class Quiz
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Are u ready for a quiz ? enter yes or no");
		String s=sc.next();
		String s1="yes";
		if(s.equals(s1))
		{
			System.out.println("their are total4 questiona");
			System.out.println("Q1) We have how many legs ?");
			System.out.println("		1)one");
			System.out.println("		2)two");
			System.out.println("		3)three");
			System.out.println("choose correct option");
			int c=2;
			int d=0;
			int n=sc.nextInt();
			if(n==c)
			{
				System.out.println("correct answer");
				d=d+1;
			}
			else
			{
				System.out.println("wrong answer");
			}
			System.out.println("Q2) We have how many nose ?");
			System.out.println("		1)one");
			System.out.println("		2)two");
			System.out.println("		3)three");
			System.out.println("choose correct option");
			int l=sc.nextInt();
			int k=1;
			if(l==k)
			{
				System.out.println("correct answer");
				d=d+1;
			}
			else
			{
				System.out.println("wrong answer");
			}
			System.out.println("overall you got "+d+" out of 2 correct");
		}
	else
			System.out.println("Go and sleep");
	}
}			
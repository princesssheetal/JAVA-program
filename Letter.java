import java .util.Scanner;
class Letter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR MESSAGE .");
		String s=sc.nextLine();
		System.out.println("YOUR MESSAGE IS "+s.length()+"CHAR LONG .");
		System.out.println("THE CHAR AT POS 0 IS "+s.charAt(0));
		int last=s.length()-1;
		System.out.println(" THE LAST CHAR IS AT POS "+last+" AND IS"+s.charAt(last));
		System.out.println(" HERE ARE THE CHAR ONE AT A TIME!");
		for(int i=0;i<s.length();i++)
		{
			System.out.println("\t"+ i +"- '"+s.charAt(i)+"'");
		}
		
		int a=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='A')
			{
				a++;
			}
		}
	
		System.out.println("\n YOUR MESSAGE CONTAINS THE LETTER 'a'  "+a+"times. ");
	}
}
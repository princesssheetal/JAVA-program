import java .util.Scanner;
class sname
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first:");
		String s=sc.next();
		StringBuffer sb= new StringBuffer(s);
		System.out.println("enter last:");
		String l=sc.next();
		sb.append(" ");
		sb.append(l);
		System.out.println("full:"+sb);
		int n=sb.indexOf(" ");
	System.out.println("enter mid:");
		String m=sc.next();
		sb.insert(n," ");
		sb.insert(n+1,m);
		System.out.println("fully:"+sb);
		
	}
}
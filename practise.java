/*class practise
{
	public static void main(String args[])
	{
		System.out.println("enter number");
		int n=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(n);
		System.out.println(b);
}
}*/
/*import java.util.Scanner;
class practise
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		String s=sc.next();
		char c=sc.next().charAt(0);
			System.out.println(n);
			System.out.println(s);
			System.out.println(c);
}
}*/
/*import java.io.*;
class practise
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		int n=Integer.parseInt(br.readLine());
		char c=(char)br.read();
		br.skip(2);
		String s=br.readLine();
		
			System.out.println(n);
			System.out.println(c);
			System.out.println(s);
	}
}
*/
/*import java.util.Scanner;
class practise
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[]=new int[n];
		int arrr[][]=new int[r][c];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
				arrr[j][k]=sc.nextInt();
		}
		for(int i=0;i<n;i++)	
		System.out.println("1d= "+arr[i]);
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
			{
				System.out.print(arrr[j][k]+" ");
			}
				System.out.println("\n");
		}
	}
}*/
import java.util.Scanner;
class demo
{
	private int a;
	private String name;
	demo()
	{
		name="sheetal";
		a=22;
	}
	demo(int a,String name)
	{
		this.a=a;
		this.name=name;
	}
	void display()
	{
		System.out.println(a+" "+name);
	}
}
class practise
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		String s=sc.next();
		demo obj=new demo();
		demo obj1=new demo(20,"sheetal");
		demo obj2=new demo(n,s);
		obj.display();
		obj1.display();
		obj2.display();
}
}
		
			

		
			
				
import java.io.*;
class person
{
 	private String str;
	private int n;

	public void accept() throws IOException
	{
		BufferedReader br=new BufferedReader(new 
		InputStreamReader(System.in));

		
		System.out.println("enter name");
		str =br.readLine();
		System.out.println("enter age");
		n=Integer.parseInt(br.readLine());
		
	}
	
	public void check()
	{
		if(n<=30)
			System.out.println(str+"is young");
		else if(n<=50)
			System.out.println(str+" is middle age");
		else
			System.out.println(str+" is old");
	}
}

class methods
{
	public static void main(String args[]) throws IOException
	{
		person obj=new person();
		obj.accept();
		obj.check();
	}
}
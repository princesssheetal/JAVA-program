import java.io.*;
class accept
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new 
		InputStreamReader(System.in));

		System.out.println("enter any integer");
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("enter any char");
		char c=(char)br.read();
		br.skip(2);

		
		System.out.println("enter any string");
		String str =br.readLine();

		System.out.println("no is : "+n);
		System.out.println("real char: "+c);
		System.out.println("string is : "+str);
	
		
	
	}
}
		
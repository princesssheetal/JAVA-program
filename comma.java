import java.io.*;
import java .util.*;
class comma
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new 
		InputStreamReader(System.in));

		System.out.println("enter no,char,string");
		String str=br.readLine();
		StringTokenizer st =new StringTokenizer(str,",");
		String s1= st.nextToken();
		String s2= st.nextToken();
		String s3= st.nextToken();
		
		int n =Integer.parseInt(s1);
		String c=s2;
		String stee=s3;

		System.out.println("no is : "+n);
		System.out.println("real char: "+c);
		System.out.println("string is : "+stee);
	
		
	
	}
}
		
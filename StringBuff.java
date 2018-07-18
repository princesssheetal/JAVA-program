import java.io.*;
class StringBuff
{
	public static void main (String args[]) throws IOException
	{
		StringBuffer sb=new StringBuffer();
		
		BufferedReader br=new BufferedReader(new 
		InputStreamReader(System.in));
		System.out.println("enter surname : ");
		String sur=br.readLine();

		System.out.println("enter midname : ");
		String mid=br.readLine();

		System.out.println("enter lastname : ");
		String last=br.readLine();
		
		sb.append(sur);
		sb.append(last);
		
		System.out.println("name : "+sb);
		int n=sur.length();
		sb.insert(n,mid);
		System.out.println("full name : "+sb);
		System.out.println("reverse name :"+sb.reverse());
	
	}
}
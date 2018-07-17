import java.io.*;
class ascending
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new 
		InputStreamReader(System.in));
		
		System.out.println("enter size of array");
		int n= Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++)
		{
	
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
		}
		System.out.println("sorted elements of array");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}
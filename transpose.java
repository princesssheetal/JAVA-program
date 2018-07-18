import java.io.*;
import java.util.Scanner;
class transpose
{
	public static void main (String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of row n col:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("enter the matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			arr[i][j]=sc.nextInt();
		}
		
		System.out.println("the tranpose matrix :");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
			System.out.print(arr[j][i]+" ");
			}
			System.out.println("\n");
		}
	}
}
		

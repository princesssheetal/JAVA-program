import java.util.Scanner;
class sort
{
	void ascend(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	void descend(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	void display(int a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		System.out.println(" "+a[i]);
	}
}
class sorting
{
	public static void main(String args[])
	{
		int i;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER"+n+"ELEMENTS");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		sort obj=new sort();
		System.out.println("ELEMENTS IN ASCENDING ORDER");
		obj.ascend(a);
		obj.display(a);
		System.out.println("ELEMENTS IN DESCENDING ORDER");
		obj.descend(a);
		obj.display(a);
	}
}
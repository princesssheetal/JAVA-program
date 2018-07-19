class old
{
	static int x=33;
	static void acces()
	{
		System.out.println("value of x="+x);
	}
}
class Static
{
	public static void main(String args[])
	{
		old.acces();
	}
}
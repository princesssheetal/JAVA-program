abstract class my
{
	abstract void cal(double x);
}
class one extends my
{
	void cal(double x)
	{
		System.out.println("square= "+(x*x));
	}
}
class two extends my
{
	void cal(double x)
	{
		System.out.println("square root= "+Math.sqrt(x));
	}
}
class Abstract
{
	public static void main(String args[])
	{
		one o= new one();
		two t= new two();
		o.cal(5);
		t.cal(25);
	}
}
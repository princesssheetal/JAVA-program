class New
{
	double sum(double n1,double n2)
	{
		double res=n1+n2;
		return res;
	}
}
class Return
{
	public static void main(String args[])
	{
		New obj =new New();
		double d=obj.sum(4,5);
		System.out.println("sum is: "+d);
	}
}
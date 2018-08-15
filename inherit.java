class Shape
{
	protected double l;
	Shape(double l)
	{
		this.l=l;
	}
	
}
class sq extends Shape
{
	sq(double l)
	{
		super(l);
	}
	void area()
	{
		System.out.println("area of sq = "+(l*l));
	}
	
}
class rect extends Shape
{
	double y;
	rect(double x,double y)
	{
		super(x);
		this.y=y;
	}
	void area()
	{
		System.out.println("area of rect= "+(l*y));
	}	
}
class inherit
{
	public static void main(String args[])
	{
	sq obj =new sq(5.5);
	obj.area();
	rect obj1 =new rect(5.5,6);
	obj1.area();
	}
}
		
class triangle
{
	int a,b,c;
	triangle(int aa,int bb,int cc)
	{
		a=aa;
		b=bb;
		c=cc;
	}
	triangle(int aa,int bb)
	{
		a=aa;
		b=bb;
		
	}
	void area()
	{
		System.out.println("area is ="+(0.5*a*b));
	}
	void area1()
	{
		double s,x;
		s=(a+b+c)/2;
		x=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of 3 sided triangle is ="+x);
	}
}
class tri
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		triangle obj=new triangle(a,b);
		if(args.length==3)
		{
			int c=Integer.parseInt(args[1]);
			triangle obj1=new triangle(a,b,c);
			obj1.area1();
		}
		else
			obj.area();
	}
}	
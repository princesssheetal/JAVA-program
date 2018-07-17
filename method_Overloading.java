class cal_vol
{
	void vol(double r)
	{
		System.out.println("\n vol of sphere is="+(1.44*3.14*r*r*r));
	}
	void vol(double r,double a)
	{
		System.out.println("\n vol of cone is="+(0.33*r*r*a));
	}
	void vol(double r,double b,double h)
	{
		System.out.println("\n vol of box is="+(r*b*h));
	}
}
class shape
{
	public static void main(String args[])
	{
		cal_vol obj=new cal_vol();
		double r=Double.parseDouble(args[0]);
		if(args.length==2)
		{
			double a=Double.parseDouble(args[1]);
			obj.vol(r,a);
		}
		else if(args.length==3)
		{	
			double b=Double.parseDouble(args[1]);
			double h=Double.parseDouble(args[2]);	
			obj.vol(r,b,h);
		}
		else
			obj.vol(r);
	}
}

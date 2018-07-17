class intrest 
{
	double p,r,t;
	intrest(double pp,double rr,double tt)
	{
		p=pp;
		r=rr;
		t=tt;
	}
	void si()
	{
		System.out.println("intrest is ="+(p*r*t)/100);
	}
	
}
class SIntrest
{
	public static void main(String args[])
	{
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		double t=Double.parseDouble(args[2]);
		intrest obj=new intrest(p,r,t);
		obj.si();
	}
}
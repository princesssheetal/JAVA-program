class commercial
{
	private String name;
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void cal(int units)
	{
		System.out.println("customer "+getname());
		System.out.println("bill= "+units*5.00);
	}
}
class domestic extends commercial
{
	void cal(int units)
	{
		System.out.println("customer "+getname());
		System.out.println("bill= "+units*2.50);
	}
}
class overriding
{
	public static void main(String args[])
	{
	commercial c=new commercial();
	c.setname("sheetal");
	c.cal(100);
	domestic d=new domestic();
	d.setname("panda");
	d.cal(100);
}
}
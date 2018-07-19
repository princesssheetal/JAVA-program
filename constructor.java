class person
{
	private String name;
	private int age;
			
	person()
	{
		name="sheetal";
		age=21;
	}
	
	person(String s,int i)
	{
		name=s;
		age=i;
	}
	
	void display()
	{
		System.out.println("my name is : "+name);
		System.out.println("my age is : "+age);
	}
}
class constructor
{
	public static void main(String args[])
	{
		person obj1= new person();
		obj1.display();
		
		person obj2=new person("sheetal",21);
		obj2.display();
	}
}
class person
{
	String name;
	int age;
	void display()
	{
		System.out.println("my name is : "+name);
		System.out.println("my age is : "+age);
	}
}
class class_object
{
	public static void main(String args[])
	{
		person obj= new person();
		obj.name="sheetal";
		obj.age=21;
		obj.display();
	}
}
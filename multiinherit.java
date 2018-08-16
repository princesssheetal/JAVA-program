interface father
{
	float ht=6.2f;
	void height();
}
interface mother
{

	float ht=5.2f;
	void height();
}
class child implements father,mother
{
	public void height()
	{
		float ht=(father.ht+mother.ht);
		System.out.println(" child height = "+ht);
	}
}
class multiinherit
{
	public static void main(String args[])
	{
		child c= new child();
		c.height();
	}
} 

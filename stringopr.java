class stringopr
{
	public static void main (String args[])
	{
		String s1="my name is sheetal";
		String s2=new String("i like painting");
		char arr[]={'h','a','p','p','y'};
		String s3=new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("length of s1 : "+s1.length());
		System.out.println("s1 join s2 : "+s1.concat(s2));
		boolean x=s1.startsWith("my");
		if(x)
		System.out.println("s1 starts with my");
		else
		System.out.println("s1 not start with my");

		String p=s2.substring(4,8);
		System.out.println(p);
		
		System.out.println("s2 in capital"+s3.toUpperCase());
	}
}
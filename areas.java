import java.util.Scanner;
class areas
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("		1)Triangle ");
			System.out.println("		2)Rect ");
			System.out.println("		3)Square ");
			System.out.println("		4)Quit");
			System.out.println("		which shape: ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1: 	System.out.println("base :");
						int a=sc.nextInt();
						System.out.println("height :");
						int b=sc.nextInt();
						double c=(a*b)/2;
						System.out.println("area is =  "+c);
						break;

				case 2: 	System.out.println("length :");
						int d=sc.nextInt();
						System.out.println("breadth :");
						int e=sc.nextInt();
						double f=d*e;
						System.out.println("area is =  "+f);
						break;

				case 3: 	System.out.println("side :");
						int g=sc.nextInt();
						double h=g*g;
						System.out.println("area is =  "+h);
						break;

				case 4:		System.out.println("GOOD BYE :");
						System.exit(0);
					
				
				default :	System.out.println("wrong choice");
			}
			}
			while (opt !=4);

						
					
	
		
	}
}		
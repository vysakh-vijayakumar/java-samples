public class Divisiblity
{
	public static void main(String[] args)
	{
		
		if (args.length < 2)
		{
			System.out.println("Give atleast two numbers");
		}
		else
		{
			int num = Integer.parseInt(args[0]);
			int div = Integer.parseInt(args[1]);
			if( num % div == 0)
			{
				System.out.println("Divisible");
			}
			else
			{
				System.out.println("Not Divisible");
			}
		//System.out.println(leng);
		//System.out.println(div);
		}

		
	}
}

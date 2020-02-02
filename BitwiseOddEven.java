public class BitwiseOddEven
{
	public static void main(String[]args)
	{
		/*if(args.length < 1)
		{
			System.out.println("Enter a number");
		}
		else
		{*/
			int num = Integer.parseInt(args[0]);
			if((num&1) == 1)
			{
				System.out.println("It is a Odd Number");
			}
			else
			{
				System.out.println("It is a Even Number");
			}
		//}
	}

}


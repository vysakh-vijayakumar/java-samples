public class EvenNumBitwise
{
	public static void main(String[]args)
	{
		for(int i = 1; i <= 100; i++)
		{
			if((i&1) != 1)
			{
				System.out.println(i);
			}
		}
	}
}

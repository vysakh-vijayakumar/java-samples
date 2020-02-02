public class BitwiseAndOr
{
	public static void main(String[]args)
	{	//------------------------------------ " && " -----------------------------------------------
		int x = 10;
		int y = 20;
		if(++x>11 && ++y>22) //After "&&" program will not execute and value of "y" will not increment.
		{			// Left hand operand is false so false && with anything will be false so && will not execute further.
		 	System.out.println("True1");
		 	
		}
		else
		{
			System.out.println("False1");
		}
		System.out.println(x);
		System.out.println(y);
		
		//------------------------------------ " & " -----------------------------------------------
		int a = 10;
		int b = 20;
		if(++a>11 & ++b>22) //After "&" here program will execute and value of "y" will increment.
		{
		 	System.out.println("True2");// but "&&" is faster than "&". So in conditional expressions we will use "&&".
		 	
		}
		else
		{
			System.out.println("False2");
		}
		System.out.println(a);
		System.out.println(b);
		//------------------------------------ " || " -----------------------------------------------
		int p = 25;
		int q = 12;
		if(++p<27 || ++b<12)// left and operand is true so "||" will not execute the second operand operations, So value of b will 
		{		//     not increment.
			System.out.println("True3");
		}
		else
		{
			System.out.println("False3");
		}
		System.out.println(p);
		System.out.println(q);
		//------------------------------------ " | " -----------------------------------------------
		int c = 25;
		int d = 12;
		if(++c<27 | ++d<12)// After "|" here program will execute and value of "d" will increment.
		{		
			System.out.println("True3");//"||" is faster than "|"
		}
		else
		{
			System.out.println("False3");
		}
		System.out.println(c);
		System.out.println(d);


	}
}




















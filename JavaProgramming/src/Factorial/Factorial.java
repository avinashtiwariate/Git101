package Factorial;

/*
 * wap to print factorial of a number n
 * 
*/

public class Factorial 
{
	public static void main(String[] args) 
	{
		int n=7;
		
		int t1=n;
		int multi=1;
		for (int i =n ; i>0; --i) 
		{	//System.out.println(i);
			multi= multi*i;
		}
		
		System.out.println(multi);
		
	}
}

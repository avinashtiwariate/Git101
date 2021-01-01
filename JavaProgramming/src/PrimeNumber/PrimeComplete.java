package PrimeNumber;

import java.util.Scanner;

public class PrimeComplete 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lower range");
		int lr = sc.nextInt();
		System.out.println("enter the higher range");
		int hr = sc.nextInt();	
		
		PrimeComplete pc = new PrimeComplete();
		pc.PrimeRange(lr, hr);
	}

	public void PrimeRange(int lr, int hr)
	{
		if (lr>hr) 
		{
			int temp=lr;
			lr=hr;
			hr=temp;
		}
		
		//3  //3<70
		//4  //4<70
		//5  //5<70
		//6  //6<70
		//7  
		for (int k = lr; k <=hr; k++) 
		{						
			// 2<(3/2) f
			// 2<(4/2) f
			// 2<(5/2) f?
			//2<(6/2)  t
			//2<(7/2)  t
			boolean isPrime=true;

			for (int j= 2; j<=k/2; j++) 
			{		
				//6%2 t>>isPrime=false>>not a prime
				//7%2 f
				//7%3 f
				
				if (k%j==0) 									
				{
					isPrime=false;
					break;
				}
			}

			if(isPrime==true) 
			{
				System.out.println(k);
			}	

			
		}
	}
}

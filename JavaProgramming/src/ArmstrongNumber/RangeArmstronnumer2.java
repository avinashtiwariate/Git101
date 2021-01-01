package ArmstrongNumber;
//check where is the error
/// Generate armstrong number
public class RangeArmstronnumer2 
{
	public static void main(String[] args) 
	{
		int countStart=0;
		int count=10;

		for (long num = 0; countStart<count; num++) 
		{


			long temp=num;
			long sum=0;

			while (temp>0) 
			{
				long t=temp%10;
				sum=sum+t*t*t;
				temp= temp/10;
			}

			if (sum==num) {
				System.out.println(num);
				countStart++;
			}
		}
	}

}	

package ArmstrongNumber;
//print all armstrong number before 1000.
public class RangeArmstrongNumber 
{
	public static void main(String[] args) 
		{
			for (int num = 0;  num< 1000; num++) 
			{
				int temp=num;
				int sum=0;

				while (temp>0) 
				{
					int t=temp%10;
					sum=sum+t*t*t;
					temp= temp/10;
					//System.out.println(sum);
				}

				if (sum==num) 
				{
					System.out.println(num+" is an armstrong number");
				}

			}
		}
}
	


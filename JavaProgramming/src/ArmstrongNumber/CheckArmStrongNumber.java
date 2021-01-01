package ArmstrongNumber;

public class CheckArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int num=2;
		
		int temp=num;
		int sum=0;
		
		while (temp>0) {
		int t=temp%10;
		sum=sum+t*t*t;
		temp= temp/10;
		
		System.out.println(sum);
		}
		
		if (sum==num) {
		System.out.println(num+" is an armstrong number");
		}
		else {
		System.out.println("not an armstrong number");
		}
		
		
	}
}

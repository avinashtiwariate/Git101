package Leapyear;

public class LeapYear1 
{
	public static void main(String[] args) 
	{
		int year=2100;
		boolean isLeapYear=false;
		
		
		if (year%4==0) 
		{
			isLeapYear=true;
			if (year%100==0 && year%400!=0) 
			{
				isLeapYear=false;
			}
		}
		
		if (isLeapYear==true) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
			
	
		
		
		
		
	}

}

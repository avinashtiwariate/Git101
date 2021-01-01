package ArmstrongNumber;

import java.util.Scanner;
//1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748,

public class ArmstrongNumberInternet 
{

	 public static void main(String args[])
	 {
	 int n,copy=152,remainder,sum,x;
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the number");
	     n=sc.nextInt();
	 
	     //starting copy from 152 as we know 153 is an armstrong no
	 
	 System.out.println("First "+n+" armstrong numbers are");
	     while(n!=0)
	     { 
	         copy++;
	       x=copy;
	         sum=0;
	         while(copy!=0)
	         {
	             remainder=copy%10;
	             sum=sum+remainder*remainder*remainder;
	             copy=copy/10;
	         }
	         if(sum==x)
	         {
	             System.out.print(x+" ");
	             n--;
	         }
	         copy=x;
	     }
	 }
}


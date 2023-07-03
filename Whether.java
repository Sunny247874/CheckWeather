package doubt;

import java.util.Scanner;

public class Whether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("User print Number:");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Number is Negative");
		}
	   else if(n>0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Zero");
		}
		

	}

}

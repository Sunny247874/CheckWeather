package doubt;

import java.util.Scanner;

public class Largest_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();		
		if(a>b && a>c)
		{
			System.out.println(a+":Number is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+":Number is greater");
		}
		else
		{
			System.out.println(c+":Number is greater");
		}
	}

}

package doubt;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Fibonaci Number:");
		int n=sc.nextInt();
		int first=0,second=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(first+" ");
			int sum=first+second;
			first=second;
			second=sum;
			
		}
	}

}

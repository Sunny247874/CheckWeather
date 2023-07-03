package doubt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average_ListOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		boolean val=true;
		do {
			int n=sc.nextInt();
			if(n!=-1)
			{
				list.add(n);
			}
			else
			{
				val=false;
			}
		}
		while(val);
		
		int sum=0;
		for(int num:list)
		{
			sum+=num;
		}
		
		double average=(double)sum/list.size();
		System.out.println("list of average:"+average);

	}

}

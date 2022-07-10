package com.gl.transactions;
import java.util.Scanner;

public class Targets {
	
	public static void main (String [] args) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the Number of transactions ");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Values");
		for (int i=0;i<size;i++)
		{
		arr[i]=sc.nextInt();
		}
	System.out.println("Enter the number of  targets to be achieved");
	int targetNo=sc.nextInt();
	
	while(targetNo-- !=0) {
		int flag=0;
		long target;
		
		System.out.println("Enter a total target value");
		target=sc.nextInt();
		
		long sum=0;
		for (int i=0;i<size;i++)
			
		{
			sum+=arr[i];
			
			
			if(sum>target)
			{
				System.out.println("Target Reached");
				flag=1;
				break;
			}
			
		}	
			
	
	if(flag == 0)
	{
		System.out.println("Target not reached");
	}
	
	}
	
	}
	

}

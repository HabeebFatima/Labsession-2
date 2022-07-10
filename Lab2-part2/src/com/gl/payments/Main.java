package com.gl.payments;

import java.util.Scanner;

public class Main {
	NotesCounter notescount = new NotesCounter();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of currency in Denomination value");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int	[] currency= new int[size];
		System.out.println(" Enter Currency denomination values");
		
		for (int i=0; i<size;i++)
		{
			currency[i]=sc.nextInt();
		}
		
		
		System.out.println(" Enter the amount to be paid ");
		int amount =sc.nextInt();
		MergeSort mergesort = new MergeSort();
		mergesort.sort(currency,0,currency.length-1);
		
	NotesCounter.notesCountImplementation(currency,amount);
		
	}

}

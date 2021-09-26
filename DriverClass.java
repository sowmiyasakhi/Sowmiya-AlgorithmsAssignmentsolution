package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.Operations.*;

public class DriverClass 
{

	public static void search(double stockarr[])
	{
		Scanner sc= new Scanner(System.in);
		StockSearch search= new StockSearch();
		System.out.println("Enter key value:");
        double key= sc.nextDouble();
        int index= search.searchStock(stockarr, key);
        if(index>=0)
        	System.out.println("Stock value present at:" + " " + index);
        else
        	System.out.println("Stock value not found!");
	}

	public static void main(String[] args) 
	{
		StockSort sort= new StockSort();
		StockTrack track= new StockTrack();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of companies:");
		int size= sc.nextInt();		
		double[]stockarr= new double[size]; 
		boolean[]stockstat= new boolean[size];
		int i=0;
		while(i<size)
		{
			System.out.println("Enter current stock price of company" + " " + (i+1));
			stockarr[i]= sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stockstat[i]= sc.nextBoolean();
			i++;
		
		}
		
			
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		int op= sc.nextInt();
		switch(op) 
		{
		case 1: sort.sortascending(stockarr, 0, size-1); 
		        sort.printArray(stockarr);
		        break;
		case 2: sort.sortdescending(stockarr, 0, size-1); 
		        sort.printArray(stockarr);
                break;
		case 3: track.checkStock(stockstat);
		        StockTrack.printCountTrue();
		        break;
		case 4: track.checkStock(stockstat);
                StockTrack.printCountFalse();
                break;
		case 5: search(stockarr);
		        break;
		case 6: System.out.println("Exited Successfully");
		        break;
		default:System.out.println("Invalid Operation");
		}

	}

}

package com.greatlearning.Operations;


public class StockTrack 
{
	static int counttrue=0;
	static int countfalse=0;
	public void checkStock(boolean[] stockarr)
	{
		for(int i=0; i<stockarr.length; i++)
		{
			if(stockarr[i]== true)
				counttrue++;
			else
				countfalse++;
				
		}
	}
	
	public static void printCountTrue()
	{
		System.out.println("Total no of companies whose stock price rose today:" + counttrue);
	}
	
	public static void printCountFalse()
	{
		System.out.println("Total no of companies whose stock price declined today:"+ countfalse);
	}

	

}

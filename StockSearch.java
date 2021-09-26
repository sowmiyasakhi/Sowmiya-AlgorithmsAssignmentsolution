package com.greatlearning.Operations;

public class StockSearch 
{
	public int searchStock(double arr[], double key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
				
			
		}
		
		return -1;
		
	}

	

}

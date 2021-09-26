package com.greatlearning.Operations;

public class StockSort 
{
	public void mergedescending(double arr[], int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;

		
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];

		
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		
		int i = 0, j = 0;

		
		int k = left;
		while (i < n1 && j < n2) 
		{
			if (leftArray[i] >= rightArray[j]) 
			{
				arr[k] = leftArray[i];
				
				i++;
			} 
			else 
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) 
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		
		while (j < n2) 
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	public void sortdescending(double[] notes, int left, int right) 
	{
		if (left < right) 
		{
			int mid = (left + right) / 2;
			sortdescending(notes, left, mid);
			sortdescending(notes, mid + 1, right);
			mergedescending(notes, left, mid, right);
		}
	}
	
	public void mergeascending(double arr[], int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;

		
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];

		
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		
		int i = 0, j = 0;

		
		int k = left;
		while (i < n1 && j < n2) 
		{
			if (leftArray[i] <= rightArray[j]) 
			{
				arr[k] = leftArray[i];
				
				i++;
			} 
			else 
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) 
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		
		while (j < n2) 
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	public void sortascending(double[] notes, int left, int right) 
	{
		if (left < right) 
		{
			int mid = (left + right) / 2;
			sortascending(notes, left, mid);
			sortascending(notes, mid + 1, right);
			mergeascending(notes, left, mid, right);
		}
	}
	
	public void printArray(double[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	
	

	

}

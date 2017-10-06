package com.arrays;

public class CricBuzz
{
	static void bubbleSort(int[] arr)
	{
		// 5,3,7,3,1
		int n = arr.length;// 5
		int temp = 0;
		for (int i = 0; i < n; i++)
		{// i = 0
			for (int j = 1; j < (n - i); j++)
			{// j = 1
				if (arr[j - 1] > arr[j])
				{
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}
}

package ControlStatements;
import Input.*;

public class Loops 
{
	MyInput newInput = new MyInput();
	
	public void runLoop(int n)
	{
		//System.out.println("Running Single Loop: ");
		for(int i = 1; i <= n; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void runNestedLoop(int n, int m)
	{
		System.out.println("Running Nested Loop: ");
		for(int i = 1; i <= n; i++)
		{
			System.out.print("Row " + i + " : ");
			for(int j = 1; j <= m; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public int[] arrayLoop(int n)
	{
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = newInput.getInt("Enter number to store in an Array: ");
		}
		return arr;
	}
	
	public void printArray(int arr[])
	{
		System.out.println("Printing Array... ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

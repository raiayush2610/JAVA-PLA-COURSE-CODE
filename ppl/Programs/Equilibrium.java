
package JavaTest;

import java.io.*;

class Equilibrium {

	static int findMaxSum(int []arr, int n)
	{
		int res = 0;	
		for (int i = 0; i < n; i++)
		{
			int prefix_sum = arr[i];		
			for (int j = 0; j < i; j++)	
			prefix_sum += arr[j];	
			int suffix_sum = 0;
			
			for (int j = n - 1; j >= i; j--)	
				suffix_sum += arr[j];	
			if (prefix_sum == suffix_sum)	 
				res = Math.max(res, prefix_sum);
		}
		return res;
	}

	public static void main (String[] args)	
	{
		int arr[] = {-2,3,5,1,2,6,-4,2};	
		int n = arr.length;			 
		System.out.println(findMaxSum(arr, n));	
}
}


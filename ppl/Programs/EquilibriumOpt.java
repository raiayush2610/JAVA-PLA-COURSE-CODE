package JavaTest;

public class EquilibriumOpt {
	static int findMaxSum(int arr[],int temp,int leftSum)
	{
		for(int i=0;i<arr.length;i++)
		{
			temp=temp-arr[i];
			if(temp==leftSum)
			{
				return i;
			}
			leftSum=leftSum+arr[i];
		}
		return leftSum;
	}
	public static void main(String[] args) {
		int a[]= {-2,3,5,1,2,6,-4,2};
		int sum=0;
		int leftSum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(findMaxSum(a,sum,leftSum));
		
	}

}

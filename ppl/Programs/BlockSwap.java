package JavaTest;

public class BlockSwap {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int r=3;
		int n=a.length;
		rotate(a,r,n);
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
	
	public static void swap(int[] arr,int aIndex,int bIndex,int k)
	{
		int temp;	
		for(int i=0;i<k;i++)
		{
			temp=arr[aIndex+i];
			arr[aIndex+i]=arr[bIndex+i];
			arr[bIndex+i]=temp;
		}
	}
	
	public static int[] rotate(int arr[],int r,int n)
	{
		r%=n;	
		if(r==0 || r==n)
		{
			return arr;
		}
		
		int A=r,B=n-r;
		
		while(A!=B)
		{
			if(A<B)
			{
				swap(arr,r-A,r-A+B,A);
				B=B-A;
			}
			else
			{
				swap(arr,r-A,r,B);
				A=A-B;
			}
		}
		swap(arr,r-A,r,A);
		return arr;
	}
}

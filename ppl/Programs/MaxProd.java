package JavaTest;

public class MaxProd {
public static void main(String[] args) {
	int a[]= {-1,-3,10,0,60};
	int n=a.length;
	
	int minProd=a[0];
	int maxProd=a[0];
	int ans=a[0];
	int x1,x2;
	
	for(int i=1;i<n;i++)
	{
		x1=minProd*a[i];
		x2=maxProd*a[i];
		
		minProd=Math.min(a[i], Math.min(x1, x2));
		maxProd=Math.max(a[i], Math.max(x1, x2));
		ans=Math.max(ans, maxProd);
	}
	System.out.println(ans);
}
}

package JavaTest;

public class PrimeBasic {

	public static void main(String[] args) {
		int n=30;
		for(int i=2;i<=n;i++)
		{
			int flag=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					flag+=1;
				}
			}
			if(flag==1)
			{
				System.out.print(i+" ");
			}
		}
	}

}

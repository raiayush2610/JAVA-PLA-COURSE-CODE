package JavaTest;

import java.util.Scanner;

class Prime1
	{
		public static void main(String arg[])	
		{
		int i,count;
	               System.out.print("Enter n value : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    System.out.println("Prime numbers between 1 to "+n+" are ");
		for(int j=2;j<=Math.sqrt(n);j++)
		{
		count=0;
		for(i=j*j;i<=n;i=i+j)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       System.out.print(j+"  ");     
		}
		}
	}


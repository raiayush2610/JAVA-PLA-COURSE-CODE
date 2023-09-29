package JavaTest;

public class LongestSeqOfOne {

	public static void main(String[] args) {
		int a=43;
		int count=0;
		int flip=0;
		String str=Integer.toBinaryString(a);
		System.out.println(str);
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i)=='1')
				{
					count+=1;
				}
				else if(flip==0)
				{
					count+=1;
					flip=1;
				}
				else
					break;
			}
			if(count>max)
				max=count;
			count=0;
			flip=0;
		}
		System.out.println(max);
	}
}

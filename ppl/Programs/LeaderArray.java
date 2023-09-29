package JavaTest;

public class LeaderArray {
		void printLeaders(int arr[], int size)
		{
			//16, 17, 4, 3, 5, 2
			//System.out.println(size);
			for (int i = 0; i < size; i++)
			{
				int j;
				for (j = i + 1; j < size; j++)
				{
					if (arr[i] <=arr[j]) { //16<17 j=1
						break;
					}
				}
				if (j == size) 
					System.out.print(arr[i] + " ");
			}
		}


		public static void main(String[] args)
		{
			LeaderArray lead = new LeaderArray();
			int arr[] = new int[]{16, 17, 4, 3, 5, 2}; //Enter your custom array here
			int n = arr.length;
			lead.printLeaders(arr, n);
		}
}
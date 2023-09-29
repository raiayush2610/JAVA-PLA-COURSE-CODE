package JavaTest;
class FinalPrime {
	void input(int n)
	{
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p<= n; p++)
		{
			if (prime[p] == true)
			{
					System.out.print(p+ " ");

				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
	}

	public static void main(String args[])
	{
		int n = 30;
		FinalPrime g = new FinalPrime();
		g.input(n);
	}
}

package JavaTest;

public class Prime {
		public static void main(String[] args) {
			int max = 10;
			for(int n=2;n<=max;n++) {
				if(isPrime(n)) {
					System.out.print(n+" ");
				}
			}
		}
		
		public static boolean isPrime(int num) {	
			for(int i = 2; i <= num/i; ++i) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
}

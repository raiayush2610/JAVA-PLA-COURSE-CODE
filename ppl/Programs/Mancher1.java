package JavaTest;

public class Mancher1 {

static int longestPalSubstr(String str)
{
	int n = str.length();

	int maxLength = 1;

	for (int i = 0; i < str.length(); i++) {
		for (int j = i; j < str.length(); j++) {
			int flag = 1;

			for (int k = 0; k < (j - i + 1) / 2; k++)
				if (str.charAt(i + k) != str.charAt(j - k))
					flag = 0;

			if (flag!=0 && (j - i + 1) > maxLength) {
				maxLength = j - i + 1;
			}
		}
	}

	System.out.print("Longest palindrome subString length is: ");
	return maxLength;
}

public static void main(String[] args)
{
	String str = "helloworld";
	System.out.print(longestPalSubstr(str));
}
}

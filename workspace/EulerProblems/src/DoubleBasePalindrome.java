
public class DoubleBasePalindrome {

	public static void main(String args[]) {
		String base10;
		String base2;
		String reversed;
		String reversedBase2;
		int count = 0;
		int palindromeSum = 0;
		while (count < 1000000) {
			base10 = String.valueOf(count);
			reversed = new StringBuilder(base10).reverse().toString();
			if(Integer.parseInt(base10) == Integer.parseInt(reversed)){
				base2 = Integer.toString(count, 2);
				reversedBase2 = new StringBuilder(base2).reverse().toString();
				if(Double.parseDouble(base2) == Double.parseDouble(reversedBase2)) {
					palindromeSum += count;
				}
			}
			count++;
		}
		System.out.println(palindromeSum);
	}
}

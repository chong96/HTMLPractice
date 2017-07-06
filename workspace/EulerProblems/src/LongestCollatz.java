
public class LongestCollatz {
	
	public static void main(String[] args) {
		long number = 13;
		long largestChain = 0;
		long collatzNumber;
		int count;
		long max = 5000;
		int maxCount = 0;
		while (number < 1000000) {
			collatzNumber = number;
			count = 0;
			while (collatzNumber != 1) {
				if (collatzNumber % 2 == 0) {
					collatzNumber /= 2;
					count++;
				} else {
					collatzNumber = 3 * collatzNumber + 1;
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				largestChain = number;
			}
			number++;
		}
		System.out.println(largestChain);
	}
}

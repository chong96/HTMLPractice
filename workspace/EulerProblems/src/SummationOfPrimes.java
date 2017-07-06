
public class SummationOfPrimes {

	public static void main(String args[]) {
		long max = 2000000;
		long number = 2;
		long sum = 0;
		
		while (number < max) {
			if(isPrime(number)) {
				sum += number;
			}
			number++;
		}
		System.out.println(sum);
	}
		
	
	public static boolean isPrime(long number) {
		if (number%2==0 && number != 2) {
			return false;
		} else {
			for(int i=3;i*i<=number;i+=2) {
				if(number%i==0){
					return false;
				}
			}
		}
		return true;
	}
}

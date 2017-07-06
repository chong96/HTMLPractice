
public class Prime {

	public static void main(String[] args){
		long primeNumber = 0;
		int count = 0;
		int i = 1;
		int number = 1;
		boolean prime = true;
		while(count < 10001){
			prime = true;
			number++;
			for(i = 2;i < number; i++){
				if(number % i == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				count++;
				primeNumber = number;
			}
		}
		System.out.println(primeNumber);
	}
}
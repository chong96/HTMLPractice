import java.util.Scanner;

public class PrimeFactors {
	
	public static void main(String[] args) {
		double factor = 1;
		double j = 0;
		double i = 0;
		double largest = 0;
		double number;
		boolean prime = true;
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		number = keyboard.nextDouble();
				
		for(factor = 2; factor < Math.sqrt(number); factor++) {
			prime = true;
			if(number % factor == 0){
				for(i = 2;i < factor; i++){
					if(factor % i == 0) {
						prime = false;
					}
					if(prime == false){
						break;
					}
				}
				if(prime == true){
					if(factor > largest){
						largest = factor;
					}
				}
			}
		}
		System.out.println(largest);
	}
}

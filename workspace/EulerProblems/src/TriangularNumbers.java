
public class TriangularNumbers {

	public static void main(String[] args) {
		int num = 0;
		int divisors = 0;
		long triangle = 0;
		while (divisors <= 500) {
			divisors = 0;
			num++;
			triangle += num;
			for (int i = 1; i * i <= triangle; i++) {
				if (triangle % i == 0) {
					divisors += 2;
				}
			}
			
		}
		System.out.println(triangle);
	}
	
}

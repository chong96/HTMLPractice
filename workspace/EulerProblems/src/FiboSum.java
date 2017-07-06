
public class FiboSum {
	
	public static void main(String[] args) {
		int sum = 2;
		int a = 1;
		int b = 2;
		int c = 0;
		while (c < 4000000) {
			c = a + b;
			a = b;
			b = c;
			if (c % 2 == 0) {
				sum += c;
			}
		}
		System.out.println(sum);
	}
}

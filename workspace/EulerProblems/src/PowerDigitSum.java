import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {
		int result = 0;
		 
		BigInteger number = BigInteger.valueOf(2);
		number = number.pow(1000);
		String s = number.toString();

		for (int i = 0; i < s.length(); i++) {
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			result += j;
		}
		System.out.println(result);
	}
}
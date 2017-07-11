import java.awt.List;
import java.util.Arrays;

public class DistinctPowers {

	public static void main(String args[]) {
		int index = 0;
		int distinctNumbers = 0;
		String[] answers = new String[10000];
		String answer;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				answer = String.valueOf(Math.pow(i, j));
				if(!Arrays.asList(answers).contains(answer)) {
					answers[index] = answer;
					index++;
					distinctNumbers++;
				}
			}
		}
		System.out.println(distinctNumbers);
	}
}

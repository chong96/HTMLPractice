
public class SumSquareDifference {

	public static void main(String[] args){
		long sumOfSquares = 0;
		long squareOfSums = 0;
		int sum = 0;
		long difference = 0;
		for(int i = 1; i < 101; i++){
			sumOfSquares += i * i;
			sum += i;
		}
		squareOfSums = sum * sum;
		difference = squareOfSums - sumOfSquares;
		System.out.println(squareOfSums);
		System.out.println(sumOfSquares);
		System.out.println(difference);
	}
}

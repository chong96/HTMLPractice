
public class SmallestMultiple {

	public static void main(String[] args){
		boolean found = false;
		int i = 1;
		int j = 1;
		while(!found){
			for(j = 1; j < 21; j++){
				if(i % j == 0){
					continue;
				} else { break; }
			}
			if(j > 20) {
				found = true;
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}

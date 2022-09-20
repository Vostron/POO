package Aula04;

public class Ex40 {
	public static void main(String[] args) {
		int[] v = new int[20];
		int sum = 0;
		
		for(int i = 0; i < 20; i++) {
			sum = 0;
			
			for(int j = 1; j < 4; j++)
				
				if((i-j) >= 0)
					sum += v[i-j];
				else
					sum = 1;
			
			v[i] = sum;
			System.out.printf("%d, ", v[i]);
		}
		
		
	}
}

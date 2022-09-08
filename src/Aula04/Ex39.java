package Aula04;

public class Ex39 {
	public static void main(String[] args) {
		int fib1 = 0, fib2 = -1;
		
		for(int i = 0; i < 30; i++) {
			fib1 = fib1 + fib2;
			fib2 = fib1 - fib2;
			System.out.printf("%d\n", fib1 * (-1));
		}
	}
}

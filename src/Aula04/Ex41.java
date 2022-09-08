package Aula04;

import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int j = 1;
		int[] v = new int[30];
		for(int i = 0; i < 30; i++) {
			if(i == 0) {
				v[i] = i + j;
				continue;
			}
			v[i] = v[i-1] + j;
			j += 2;
			System.out.printf("%d\n", v[i]);
		}
		
	}
}

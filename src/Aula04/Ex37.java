package Aula04;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i < 21; i++) {
			System.out.printf(""
					+ "\n#################\n"
					+ "#  Tabuada %-2d   #\n"
					+ "#################\n", i);			
			
			for(int j = 1; j < 11; j++)
				System.out.printf("# %-2d x %-2d = %-3d #\n", j, i, (i * j));
			System.out.printf("#################\n");
			
			System.out.printf("Pressione qualquer tecla para continuar...");
			ler.nextLine();
		}
	}
}

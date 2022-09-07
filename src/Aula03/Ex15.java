package Aula03;

import java.util.Scanner;

public class Ex15 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] v = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite o tamanho do %d lado: ", i + 1);
			v[i] = ler.nextInt();
		}
		
		if((v[0] + v[1]) > v[2] && (v[1] + v[2]) > v[0] && (v[2] + v[0]) > v[1]) {
			if(v[0] == v[1] && v[1] == v[2])
				System.out.printf("Triangulo Equilatero");
			else if(v[0] == v[1] || v[1] == v[2] || v[2] == v[0])
				System.out.printf("Triangulo Isosceles");
			else
				System.out.printf("Triangulo escaleno");
		}else {
			System.out.printf("Os lados nao formam um triangulo");
		}
		
		
	}
}

package Lista04;

import java.util.Scanner;
import java.lang.Math;

public class L04_Q04 {

	public static void main(String[] args) {
		int[] A = new int[15];
		double[] B = new double[15];
		int i;

		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < 15; i++) {
			System.out.print("Digite o elemento " + (i + 1) + " para o vetor A: ");
			A[i] = scanner.nextInt();
		}

		for (i = 0; i < 15; i++) {
			B[i] = Math.sqrt(A[i]);
		}
		System.out.println("Posição dos elementos e elementos do vetor B:");
		for (i = 0; i < B.length; i++) {
			System.out.println("Posição " + i + ": Elemento de B = " + B[i]);
		}

	}

}

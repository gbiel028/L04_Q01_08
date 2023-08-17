package Lista04;

import java.util.Scanner;
import java.lang.Math;

public class L04_Q03 {

	public static void main(String[] args) {
		int[] A = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] B = new int[15];
		int i;

		Scanner LerNum = new Scanner(System.in);
		for (i = 0; i < 15; i++) {
			System.out.print("Digite o elemento " + (i + 1) + " para o vetor A: ");
			A[i] = LerNum.nextInt();
		}

		for (i = 0; i < A.length; i++) {
			B[i] = (int) Math.pow(A[i], 2);
			System.out.println("Posicao " + i + " - Elemento de B: " + B[i]);
		}

	}

}

package Lista04;

import java.util.Scanner;

public class L04_Q07 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		int i;

		Scanner LerNum = new Scanner(System.in);
		
		for (i = 0; i < 10; i++) {
			System.out.print("Digite os elementos para o vetor A  " + (i + 1) + ": ");
			A[i] = LerNum.nextInt();
			
			System.out.print("Digite os elementos para o vetor B  " + (i + 1) + ": ");
			B[i] = LerNum.nextInt();
			C[i] = A[i] - B[i];
		}
		for (i = 0; i < C.length; i++) {
			System.out.println("Posicao " + i + ": Elemento de C = " + C[i]);
		}
	}
}


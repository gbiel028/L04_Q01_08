package Lista04;
import java.util.Scanner;

public class L04_Q02 {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6,7,8};
        int[] B = new int[A.length];
        int i;
        
        Scanner LerNum = new Scanner(System.in);
        for (i = 0; i < 8; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " para o vetor A: ");
            A[i] = LerNum.nextInt();
        }
        
        for (i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
            System.out.println("Posicao " + i + " - Elemento de B: " + B[i]);
        }
}
}

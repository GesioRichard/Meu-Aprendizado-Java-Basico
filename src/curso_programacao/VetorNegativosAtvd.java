package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class VetorNegativosAtvd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i+1) + "° número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Os numeros negativos são:");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}

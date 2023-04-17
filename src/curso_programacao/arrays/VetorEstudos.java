package curso_programacao.arrays;

import java.util.Locale;
import java.util.Scanner;

public class VetorEstudos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		
		double[] vetor = new double[tamanho];
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("O numero da posição " + (i + 1) + " é: " + vetor[i]);
		}
		
		System.out.printf("A média é: %.2f%n", soma / tamanho);
		
		sc.close();
	}

}

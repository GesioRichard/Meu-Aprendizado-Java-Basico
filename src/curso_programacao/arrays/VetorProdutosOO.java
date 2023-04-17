package curso_programacao.arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor;

public class VetorProdutosOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		
		ProductVetor[] vetorP = new ProductVetor[tamanho];
		
		for (int i = 0; i < vetorP.length; i++) {
			System.out.println("Digite o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double preço = sc.nextDouble();
			
			vetorP[i] = new ProductVetor(nome, preço);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vetorP.length; i++) {
			soma += vetorP[i].getPreço();
		}
		
		System.out.printf("A média dos preços é: %.2f%n ", soma / vetorP.length);
		
		sc.close();
	}

}

package curso_programacao.arrays.atividades;

import java.util.Scanner;

import entities.Aluguel;

public class VetorPensionatoAtvd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] al = new Aluguel[10];
		
		System.out.println("Quantos estudantes irão alugar quartos? ");
		int qtdEstudantes = sc.nextInt();
		
		for (int i = 0; i < qtdEstudantes; i++) {
			System.out.println("Insira o nome do Estudante: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Insira o email do estudante: ");
			String email = sc.nextLine();
			System.out.println("Insira o número do quarto onde o estudante vai ficar: ");
			int numQuarto = sc.nextInt();
			
			al[numQuarto] = new Aluguel(nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < al.length; i++) {
			if(al[i] != null) {
				System.out.println(i + ": " + al[i].toString());
			}
		}
		
		sc.close();
	}

}

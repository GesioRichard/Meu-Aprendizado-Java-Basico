package curso_programacao.arrays.atividades;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class VetorAlturaAtvd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vão ser cadastradas?");
		int n = sc.nextInt();
		
		Pessoa[] vetorP = new Pessoa[n];
		
		for (int i = 0; i < vetorP.length; i++) {
			System.out.println("Digite o nome da " + (i+1) + "° Pessoa");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite a idade da " + (i+1) + "° Pessoa");
			int idade = sc.nextInt();
			
			System.out.println("Digite a altura da " + (i+1) + "° Pessoa");
			double altura = sc.nextDouble();
			
			vetorP[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
		
		for (int i = 0; i < vetorP.length; i++) {
			somaAltura += vetorP[i].getAltura(); 
		}
		
		System.out.printf("A média de altura é %.2f%n", somaAltura / vetorP.length);
		
		int contadorMenorIdade = 0;
		
		for (int i = 0; i < vetorP.length; i++) {
			if(vetorP[i].getIdade() < 16) {
				contadorMenorIdade++;
			}
		}
		
		System.out.println("A porcentagem de pessoas menores de 16 é: " + contadorMenorIdade * 100 / vetorP.length);
		
		for (int i = 0; i < vetorP.length; i++) {
			if(vetorP[i].getIdade() < 16) {
				System.out.println(vetorP[i].getNome());
			}
		}
		
		sc.close();
	}

}

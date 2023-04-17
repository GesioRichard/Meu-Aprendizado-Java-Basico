package curso_programacao.arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Insira um numero: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Numeros na diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		
		int cont = 0;
		
		//Rodando o for com a propriedade lenght em matrizes
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("Quantidade de numeros negativos: " + cont);
		
		sc.close();
	}

}

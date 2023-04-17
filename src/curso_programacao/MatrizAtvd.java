package curso_programacao;

import java.util.Scanner;

public class MatrizAtvd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o número de linhas");
		int linhas = sc.nextInt();
		System.out.println("Insira o número de colunas");
		int colunas = sc.nextInt();

		int[][] mat = new int[linhas][colunas];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Insira um valor na linha " + i + " coluna " + j);
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite o numero da matriz que você deseja escolher: ");
		int numSelecionado = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numSelecionado) {
					System.out.println("Posição " + i + "," + j);

					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Embaixo: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}

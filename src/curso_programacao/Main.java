package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = "potato apple pineapple orange";
		String[] testeV = s.replace(" ", ";").split(";");
		
		
		System.out.println(s.replace(" ", ";"));
		System.out.println(testeV[0]);
		System.out.println(testeV[1]);
		System.out.println(testeV[2]);
		System.out.println(testeV[3]);
		
		sc.close();
	}

}

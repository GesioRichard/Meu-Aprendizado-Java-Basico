package curso_programacao.listas.atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ListaFuncionarioAtvd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();

		System.out.println("Digite a quantidade de funcionario que deseja cadastrar: ");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("FUNCIONARIO #" + (i+1));
			System.out.println("Digite o ID do funcionario: ");
			int id = sc.nextInt();
			System.out.println("Digite o nome do funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o salario do funcionario: ");
			double salario = sc.nextDouble();
			
			listaFunc.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("Digite o id do funcionario no qual você deseja aumentar o salário: ");
		int idSelecionado = sc.nextInt();
		
		Funcionario func = listaFunc.stream().filter(x -> x.getId() == idSelecionado).findFirst().orElse(null);
		
			if(func != null) {
				System.out.println("Digite a porcentagem de quanto você quer aumentar: ");
				func.aumentarSalario(sc.nextDouble());
			}else {
				System.out.println("Esse id não foi encontrado");
			}
		
		
		System.out.println("Dados dos funcionarios");
		for(Funcionario dados : listaFunc) {
			System.out.println(dados.toString());
		}
		
		sc.close();
	}

}

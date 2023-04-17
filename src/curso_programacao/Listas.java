package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		//Criar uma Lista
		List<String> lista = new ArrayList<String>();
		
		//Adicionar valores na lista
		lista.add("Pedro");
		lista.add("Caio");
		lista.add("Ana");
		lista.add("Alfredo");
		lista.add("Rafa");
		lista.add("Lucas");
		//Adicionar valores na lista utilizando um indice
		lista.add(1, "Rogerio");
		
		//Mostrar o tamanho da Lista
		System.out.println("Tamanho da lista: " + lista.size());
		
		//Percorrer a lista
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		
		System.out.println("-------------------------");
		//Remover alguem da lista, geralmente utiliza o indice, mas o java reconhece o nome(caso seja string)
		lista.remove("Pedro");
		//remover quem tiver a primeira letra como A
		lista.removeIf(x -> x.charAt(0) == 'A');
		
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		
		System.out.println("-------------------------");
		//Filtrar na lista
		System.out.println("Index do caio: " + lista.indexOf("Caio"));
		//Filtrar todas as pessoas que começam com R. Depois do filter pode colocar direto toList nas versões atuais do java
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		
		for(String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("-------------------------");
		//Achar a primeira pessoa que começa com determinada letra
		String nome = lista.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(nome);
	}
}

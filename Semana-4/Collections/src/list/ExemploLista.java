package collectionsmain.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploLista {

	public static void main(String[] args) {
		
		// <> => generics: é uma forma de restringir o tipo de elemento que vai fazer parte da coleção
		
		String [] alunos = {"Tamires", "Felipe", "Tufão", "Dalva", "Victor", "Maria", "Reginaldo"};
		
		// não ordena os elementos, array dinamico
		List listPessoas = new ArrayList();
		
		// possui melhor performance nos métodos add e remove em relação ao arrayList
		List listLinked = new ArrayList();
		
		
		
		for(String pessoa:alunos ) {
			listPessoas.add(pessoa);
		}
		
		for(String pessoa:alunos) {
			listLinked.add(pessoa);
		}
		
		// faz a ordenacao
		Set setList = new TreeSet(listPessoas);
		
		System.out.println(listPessoas);
		System.out.println(listLinked);
		System.out.println(setList);
		
		
		// Exemplo simplificado, mas, traz uma limitação, pois, ele não traz a possibilidade de adicionar novos elementos
		List <String> listAlunos = Arrays.asList(alunos);
		
		
		//estudar sobre o pool e peek

	}

}

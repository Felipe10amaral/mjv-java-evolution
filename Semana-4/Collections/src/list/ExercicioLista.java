package collectionsmain.list;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		// a lista não aceita tipos primitivos
		
		List<String> list = new ArrayList<>();
		
		list.add("Felipe");
		list.add("Tamires");
		list.add("Tufão");
		
		for(String listAuxiliar: list) {
			System.out.println(listAuxiliar);
		}
		
		System.out.println("---------------------------------------------");
		
		// adicionando um novo elemento na posicao 2
		list.add(2, "Java");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("---------------------------------------------");
		
		//tamanho da lista
		System.out.println(list.size());
		
		System.out.println("---------------------------------------------");
		
		// removendo um elemento especifico e um elemento pelo nome
		list.remove("java"); 
		list.remove(0); //remove a posicao 0 (Felipe)
		
		System.out.println(list);
		
		System.out.println("---------------------------------------------");
		
		//encontrar a posicao de um elemento, (ele não é case sensitive)
		
		System.out.println(list.indexOf("Tufão"));

	}

}

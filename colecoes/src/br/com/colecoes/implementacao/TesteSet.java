package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String> ();
		
			lista.add("DBA");
			lista.add("JR");
			lista.add("1500");
			lista.add("ANALISTA");
			lista.add("INFRA");
			lista.add("DEV");
			lista.add("SUPORTE");
			lista.add("ESTAGIARIO");
			System.out.println(lista);
			
			// No SET não existe indice
			//System.out.println(lista.get(1));
			//A ordenação que prevalece é a ordenação do Hash
			//Colletions.sort(lista);		
		
			
	}

}

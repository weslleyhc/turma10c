package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 8000));
		lista.add(new Cargo("PROJETO", "PL", 20000));
		lista.add(new Cargo("ESTAGIARIO", "SR", 5000));
		//System.out.println(lista.get(1).getSalario());
		//1� = Exiba o total de todos os sal�rios
		//2� - Exibam somente os cargos com salario maior que 70000
		float total = 0;
		for (Cargo objeto : lista) {
			if (objeto.getSalario()>7000) {
				System.out.println("Nome: " + objeto.getNome());
				System.out.println("Salario: " + objeto.getSalario());
			}
			total+=objeto.getSalario();
		}
		
		System.out.println("Total Salario: " + total);

	}

}

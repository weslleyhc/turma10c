package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.util.Magica;

public class ImplementarAluno3 {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(
				Magica.i("RM"),
				Magica.s("Nome"),
				Magica.s("Email").toLowerCase()
				);
		System.out.println(aluno.getAll());
		

	}

}

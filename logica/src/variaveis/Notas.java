package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	public static void main(String[] args) {
		// Input => nome, disciplina, duas notas
		// Exibir o nome do aluno, a média e a disciplina
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String disciplina = JOptionPane.showInputDialog("Digita a primeira disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informa a primeira nota"));
		// String disciplina2 = JOptionPane.showInputDialog("Digite a segunda disciplina");
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float media = (nota1 + nota2) / 2;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Disciplina 1: " + disciplina + "Nota 1: " + nota1);
		//System.out.println("Disciplina 2: " + disciplina1 + "Nota 2: " + nota2);
		System.out.println("Média das notas: " + media);
		System.out.printf("%s sua média na disciplina %s foi de %.2f", nome, disciplina, media);
		JOptionPane.showMessageDialog(null, nome + "\n" + disciplina + "\n" + media);
		
		/*
		 * Regras para os identificadores
		 * 1º Nunca começarás com número. 1berto (inválido) // h1berto (válido)
		 * 2º Não utilizarás palavras reservadas da linguagem. void (inválido)
		 * 3º Não farás uso de caracteres especiais. d@t@ (inválido) - data de nascimento (inválido)
		 * 
		 * Padrões
		 * - começar com letras muniscula
		 * - utilizar o padrão CamelCase. dataNacimento // numeroDeMatricula
		 * - nomes significativos
		 * 
		 * Toda classe começa com letras maiuscula
		 * Todo método vem seguido de parenteses
		 * 
		 * 
		 */
	}
}
